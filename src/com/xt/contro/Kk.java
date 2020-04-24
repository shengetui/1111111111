package com.xt.contro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Kk implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("000000000000");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean i=true;
		System.out.println("0000000000000");
		Object attribute = request.getSession().getAttribute("admin");		
if(attribute == null){
	request.getSession().setAttribute("lanjie", "先登录吧");
response.sendRedirect("index.jsp");}
else{
	
	System.out.println("dengluguo");
}

		return i;
		
		
		
		
	}

}
