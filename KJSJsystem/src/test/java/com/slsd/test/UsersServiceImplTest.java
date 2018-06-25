package com.slsd.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.slsd.entity.Users;
import com.slsd.service.UsersService;

/**
 * 用户 测试
 * @author Administrator
 *
 */
public class UsersServiceImplTest  {

	
	private UsersService usersService ;

	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		usersService =(UsersService) ctx.getBean("UsersService");
	}

	
	@Test
	public void testAddUsers() {
		Date date=new Date();
		Users user=new Users(1113, "23124", "123", "21431234", "q434", '0', 22,date,'1', "hzhou", "hzhou ", '0');
		boolean flag=usersService.addUsers(user);
		System.out.println(flag);
	}

	@Test
	public void testDelUsers() {
		boolean flag=usersService.delUsers(1);
		System.out.println(flag);
	}

	@Test
	public void testEditUsers() {
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String str="1997-07-09";
		Date date=null;
	try {
		date = format1.parse(str);
		Users user=new Users(1113, "99999", "123", "999999", "q434", '0', 22,date,'1', "hzhou", "hzhou ", '0');
		boolean flag=usersService.editUsers(user);
		System.out.println(flag);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	}

	
	@Test
	public void testGetAllUsers() {
		
		List<Users> ulist=usersService.getAllUsers();
		System.out.println(ulist.size());
		for(Users u:ulist) {
			System.out.println(u);
		}
	}
	@Test
	public void testGetUsersByUid() {
		Users user=usersService.getUsersByUid(1112);
		System.out.println(user.getUage());
	}
	
	@Test
	public void testGetUsersByPage() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("pageStart", 1);
		map.put("pageSize", 2);
		List<Users> ulist=usersService.getUsersByPage(map);
		System.out.println(ulist.size());
	}

}
