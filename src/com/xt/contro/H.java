package com.xt.contro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("h")
public class H {

	
@RequestMapping("hhh")
	public String name(Date hap,Model mo){
		System.out.println("11111111111"+hap);
		mo.addAttribute("riqi", hap);
		return "hoooo";
	}

	

}
