package com.xt.contro;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("c")
public class C {
	@RequestMapping("cc")
	public String cc(HttpSession ses, @RequestParam(value = "name") String name) {
		ses.setAttribute("ss", name);
		return "/hoooo";
	}

}
