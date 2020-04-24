package com.xt.contro;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("I")
public class I {
	@Resource
	private Ii ii;
	@RequestMapping("II")
	public String name(@ModelAttribute Gg gg,Errors er){
		ii.validate(gg, er);
		if(er.hasErrors()){
			
			return "error";
		}
		System.out.println(gg.getName());
		System.out.println("9999999IIIIII9999999");
		return "hoooo";
	}

}
