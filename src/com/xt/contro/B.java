package com.xt.contro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("xxx")
public class B {
	@RequestMapping("xxx")
	public String name(Model mo) {
		System.out.println("+++++++++++++");
		// ModelAndView mo = new ModelAndView();
		mo.addAttribute("l", "2222222222");
		// mo.setViewName("/hoooo.jsp");

		return "hoooo";
	}

	@RequestMapping("name2")
	public String name2(HttpServletRequest req) {
		System.out.println("+++++++++++++");
		req.setAttribute("name2", "saxasxaxa");
		return "redirect:/xxx/name3";
	}
	@RequestMapping("name3")
	public String name3(HttpSession ses) {
		System.out.println("+++++++++++++");
		ses.setAttribute("name3", "saxasxaxa");
		return "hoooo";
	}
	@RequestMapping("name4")
	public String name4(WebRequest req) {
		System.out.println("+++++++++++++");
		req.setAttribute("name5", "requestsaxasxaxa",req.SCOPE_REQUEST);
		req.setAttribute("name4", "sesstionsaxasxaxa",req.SCOPE_SESSION);

		return "hoooo";
	}
	

}
