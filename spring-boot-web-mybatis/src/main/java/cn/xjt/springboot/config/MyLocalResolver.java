package cn.xjt.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/3-18:39
 */
public class MyLocalResolver implements LocaleResolver {
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
//		获取请求中的参数
		String language = request.getParameter("l");
		Locale locale = Locale.getDefault();        //如果没有就是用默认的
		//如果不是空的，就使用我们自定义配置
		if(!StringUtils.isEmpty(language)){
//			zh_CN
			String[] s = language.split("_");
//			国家，地区
			locale = new Locale(s[0], s[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

	}
}
