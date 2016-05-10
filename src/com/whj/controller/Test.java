package com.whj.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.whj.bean.User;
import com.whj.service.TestService;

@Controller
@RequestMapping("/test")
public class Test {
	@Autowired
	private TestService service;
	@RequestMapping("/show.do")
	public String show(){
		System.out.println("showshowshowshowshowshowshowshow");
		return "/test/show2";
	}
	@RequestMapping("/say.do")
	public ModelAndView say(){
		System.out.println("saysaysaysaysaysaysaysaysaysaysaysay");
		User user = new User("xlj", "123456qaz");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test/say2");
		mv.addObject(user);
		return mv;
	}
	@RequestMapping("/register")
	public void register(){
		System.out.println("registerregisterregisterregisterregister");
	//	return "/test/register";
	}
	@RequestMapping("/submit.do")
	public ModelAndView submit(String username,String password){
		System.out.println("submitsubmitsubmitsubmitsubmitsubmitsubmit");
		service.addUser(username, password);
		User user = new User(username, password);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test/registerSubmit");
		mv.addObject(user);
		return mv;
	}
	@RequestMapping("/loginPage")
	public void loginPage(){
		System.out.println("loginPage");
	}
	@RequestMapping("/login.do")
	public ModelAndView login(String username,String password){
		System.out.println("login");
		ModelAndView mv = new ModelAndView();
		User user=service.login(username, password);
		if(user!=null){
			mv.setViewName("test/registerSubmit");
			mv.addObject(user);
			return mv;
		}else{
			mv.setViewName("test/loginPage");
			return mv;
		}
		
		
	}
	
	@RequestMapping("/showAllUsers.do")
	public ModelAndView showAllUsers(){
		System.out.println("showAllUsersshowAllUsersshowAllUsersshowAllUsersshowAllUsers");
		ArrayList<User> users = new ArrayList<User>(service.showAllUsers());
		System.out.println(users.toString());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/test/showAllUsersPage");
		mv.addObject("users",users);
		return mv;
	}
	@RequestMapping("/showAllUsers2.do")
	@ResponseBody
	public ArrayList<User> showAllUsers2(){
		System.out.println("showAllUsers2showAllUsers2");
		ArrayList<User> users = new ArrayList<User>(service.showAllUsers());
		System.out.println(users.toString());
		/*ModelAndView mv = new ModelAndView();
		mv.setViewName("/test/showAllUsersPage");
		mv.addObject("users",users);*/
		/*UserList userList = new UserList();
		userList.setUser(((User[])users.toArray()));*/
		return users;
	}
}
