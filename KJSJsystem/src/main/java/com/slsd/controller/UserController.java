package com.slsd.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.service.UsersService;

@Controller
public class UserController {
	
	@Resource
	private UsersService UsersService;
	
	@RequestMapping(value = "/pricing", method = RequestMethod.GET)
	public String show(Map<String, Object> model) {
//		Users users= this.UsersService.getUsersByUid(uid);
//		model.put("clist", clist);
//		System.out.println(clist);
		return "pricing";
	}

}
