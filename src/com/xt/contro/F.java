package com.xt.contro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("f")
public class F {

	@RequestMapping("f")
	public String ww(Model mo) {
	
		List<Gg> list=new ArrayList<Gg>();
		list.add(new Gg(1,"qqq"));
		list.add(new Gg(2,"www"));
		list.add(new Gg(3,"eee"));
		User u=new User();
		u.setId(2);

		mo.addAttribute("iid", u);
		mo.addAttribute("list",list);
		return "hoooo";
	}
}
