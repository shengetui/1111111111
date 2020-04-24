package com.xt.contro;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Controller
public class Ii implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return I.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
//		Gg g=(Gg)arg0;
//		if(g.getName().length()>10){
//			System.out.println(g.getName());
//			arg1.reject("name",null,"超了");
//		}
//		System.out.println("9999999IiIiIiIiIiIi99999");
//		ValidationUtils.rejectIfEmpty(arg1, "id",null, "不能为空");	
//		//ValidationUtils.rejectIfEmpty(arg1, "name",null, "不能为空");
	
	}

}
