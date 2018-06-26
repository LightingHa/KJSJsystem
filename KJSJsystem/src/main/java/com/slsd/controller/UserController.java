package com.slsd.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Users;
import com.slsd.service.UsersService;

@Controller
public class UserController {
	
	@Resource
	private UsersService UsersService;
	
	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName) {
		return formName;
	}
	
	@RequestMapping(value = "/pricing", method = RequestMethod.GET)
	public String show(Map<String, Object> model) {
//		Users users= this.UsersService.getUsersByUid(uid);
//		model.put("clist", clist);
//		System.out.println(clist);
		return "pricing";
	}
	
	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String showinfo(HttpServletRequest request,Model model) {
		int uid = Integer.valueOf(request.getParameter("id"));
		Users users = UsersService.getUsersByUid(uid);
		int uid2=users.getUid();
		model.addAttribute("a", 1);
		model.addAttribute("users", users);
		System.out.println(users);
		return "pricing";
	}

}
