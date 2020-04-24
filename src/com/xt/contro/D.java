package com.xt.contro;

import java.util.ArrayList;
import java.util.List;
import com.xt.contro.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("json")
public class D {
	
	    @RequestMapping(value="testResponseBody")
	    // @ResponseBody会将集合数据转换json格式返回客户端
	    @ResponseBody
	    public Object getJson(String id,String name) {
	    	System.out.println(id);
	    	System.out.println(name);
	    	List<User> list = new ArrayList<User>();
	    	list.add(new User(1,"xx",1,"s",2));
	    	list.add(new User(1,"xx",1,"s",2));
	    	list.add(new User(1,"xx",1,"s",2));
	    
	    
	    	
	    	return list;
	    }

	}



