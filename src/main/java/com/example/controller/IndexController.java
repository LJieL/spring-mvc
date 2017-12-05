package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;




@Controller
public class IndexController {

	@RequestMapping("/tojson")
	public String getJson() {
		return "json";
	}
	

	@RequestMapping("/testJson")
	@ResponseBody
	public String testJson(String param) {
		
		User user = JSONObject.toJavaObject(JSONObject.parseObject(param), User.class);
		System.out.println(user);
		User user1 = new User("yyf",1,22); 
		User user2 = new User("llj",2,21); 
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		
		String users = JSONObject.toJSON(list).toString();
		System.out.println(users);
		return users;
	}

}
