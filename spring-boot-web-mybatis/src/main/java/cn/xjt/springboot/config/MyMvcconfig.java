package cn.xjt.springboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/2-20:21
 */

//扩展springmvc

@Configuration      //标注当前类为配置类
public class MyMvcconfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index.html").setViewName("index");
		registry.addViewController("/404.html").setViewName("404");
		registry.addViewController("/list.html").setViewName("list");
		registry.addViewController("/dashboard.html").setViewName("dashboard");
	}

	@Bean("localeResolver")
	public LocaleResolver MyLocalResolver()
	{
		return new MyLocalResolver();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new loginHandlerinterceptor()).addPathPatterns("/**")
				.excludePathPatterns("/index.html","/","/user/login","/css/**","/js/**","/img/**");
	}
}
