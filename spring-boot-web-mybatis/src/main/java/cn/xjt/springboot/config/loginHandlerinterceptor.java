package cn.xjt.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/3-20:57
 */
public class loginHandlerinterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object loginUser = request.getSession().getAttribute("loginUser");
		if(loginUser!=null)
		{
			return true;
		}else {
			request.getSession().setAttribute("msg", "没有权限访问，请先登录");
			System.out.println("没有权限访问，请先登录");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		}
	}
}
