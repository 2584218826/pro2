package cn.xjt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/1-18:27
 */
//@RestController
@Controller     //回经过视图解析器，跳转页面
public class HelloWorld {

	@RequestMapping("/w")
	@ResponseBody
	public String hello()
	{
		return "hello world";
	}

	@RequestMapping("/hello")
	public String test(Model model)
	{
		model.addAttribute("msg", "<h1>hello,springboot</h1>");
		model.addAttribute("list", Arrays.asList("xu","tao"));
		return "hello";    //跳转到templates下的test.html
	}
}
