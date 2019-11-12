package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.pojo.User;

/**
 * @author Johnny
 * @category ajax控制器
 */

@Controller
public class AjaxController {

	@RequestMapping(value="/byid",produces="application/json;charset=utf-8")
	public @ResponseBody String findById(Integer id){
		System.out.println(id);
		String str = "{\"id\":"+id+",\"name\":'小婷',\"phone\":'1880009998'}";
		return str;
	}
	
	@RequestMapping("/byid2")
	public @ResponseBody User findById2(Integer id){
		User user = new User();
		user.setId(id);
		user.setUsername("小夏");
		user.setPassword("123");
		//将对象通过JSON的工具自动转换成为字符串
		return user;
	}
	
	@RequestMapping("/send")
	public String send(){
		return "send";
	}
	
	@RequestMapping("/send2")
	public String send2(){
		return "send2";
	}
	
	@RequestMapping("/receive")
	public @ResponseBody String receive(@RequestBody String name){
		String str = "welcome "+ name;
		System.out.println(str);
		return str;
	}
	
	@RequestMapping("/receive2")
	public @ResponseBody String receive2(@RequestBody User user){
		String str = "welcome "+ user.getUsername();
		System.out.println(str);
		return str;
	}
	
	@RequestMapping("/send3")
	public String send3(){
		return "send3";
	}
	
	
	/*
	 * 中文乱码问题得到解决
	 * 原理: 手动给对应的Accept返回制定格式编码数据。
	 * 发现produces设置多个Accept只有第一个的charset是有用的,
	 */
	@RequestMapping(value = "/receive3", produces={"text/html;charset=UTF-8;","application/json;"})
	public @ResponseBody String receive3(@RequestBody String name) {
		String str = "welcome " + name;
		System.out.println(str);
		return str;
	}


}
















