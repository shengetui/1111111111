package com.xt.contro;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class K {
	@RequestMapping("k")
	public ModelAndView name(String id , String name,Model mo,HttpSession session){
		ModelAndView md=new ModelAndView();
		if(id.equals("a")||name.equals("a")){
		
		
		mo.addAttribute("admin", "admin");
		session.setAttribute("admin", "admin");
		md.setViewName("redirect:kk");
		}
		
		else{
			md.setViewName("index");
			mo.addAttribute("lanjie", "账号密码错误");
			
		}
		return md;
	}
	@RequestMapping("kk")
	public String name2(String name){
		
		
		return "hoooo";
	}
	
	

}
