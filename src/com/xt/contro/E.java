package com.xt.contro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("e")
public class E {

	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(Exception e) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ex", e);
		mav.setViewName("error");
		return mav;
	}
@RequestMapping("ee")
	public String man() {
		System.out.println("+++++++++++");
		int y = 5 / 0;
		return "hoooo";
	}
@RequestMapping("e1")
public String e1(Model mo) {
	System.out.println("+++++++++++");
	User u= new User(1,"x",2,"xx",3);
	mo.addAttribute("command", u);
	
	
	
	return "hoooo";
}
}
