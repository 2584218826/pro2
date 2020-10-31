package cn.xjt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/3-20:28
 */

@Controller
public class loginController {

	@RequestMapping("user/login")
	public String userlogin(@RequestParam("username") String username, @RequestParam("password") String password
	, Model model, HttpSession session)
	{
		if(StringUtils.isEmpty(username) || "123456".equals(password))
		{
			session.setAttribute("loginUser", username);
			return "redirect:/dashboard.html";
		}else {
			model.addAttribute("msg", "登陆失败，你输入的用户名或密码错误");
		}
		return "index";
	}

	@RequestMapping("user/logout")
	public String logout(HttpSession session)
	{
		System.out.println("注销了");
		session.invalidate();
		return "redirect:/index";
	}
}
