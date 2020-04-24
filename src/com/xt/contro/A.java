//package com.xt.contro;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//public class A implements Controller{
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
//			throws Exception {
//		System.out.println("+++++++++++++");
//		ModelAndView mo = new ModelAndView();
//		mo.addObject("l", "123");
//		mo.setViewName("/hoooo.jsp");
//		
//		return mo;
//	}
//
//}
