package com.xt.contro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class Hh implements Converter<String,Date>{
	public Date convert(String arg0) {

		SimpleDateFormat slf = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			return slf.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
