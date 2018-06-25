package com.slsd.test;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.entity.Talks;
import com.slsd.entity.Users;
import com.slsd.service.TalksService;
import com.slsd.service.UsersService;

public class TalksServiceImplTest {
	
	private TalksService talksService;
	private  UsersService usersService ;
	
	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		talksService= (TalksService) ctx.getBean("TalksService");
		usersService =(UsersService) ctx.getBean("UsersService");
	}
	
	@Test
	public void testAddTalks() {
		Users user=usersService.getUsersByUid(374486001);
		Date tdate =new Date();
		Talks talks=new Talks( user, tdate, "test", '0');
		boolean flag=talksService.addTalks(talks);
		System.out.println(flag);
	}

	@Test
	public void testDelTalks() {
		boolean flag=talksService.delTalks(3);
		System.out.println(flag);
	}

	@Test
	public void testEditTalks() {
		Talks talks=talksService.getTalksByTid(4);
		System.out.println(talks);
		talks.setTdate(new Date());
		boolean flag=talksService.editTalks(talks);
		System.out.println(flag);
	}

	@Test
	public void testGetTalksByTuid() {
		List<Talks> tlist=talksService.getTalksByTuid(374486001);
		for(Talks t:tlist) {
			System.out.println(t);
		}
	}

	@Test
	public void testGetTalksByTid() {
		Talks talks=talksService.getTalksByTid(4);
		System.out.println(talks);
	}

	@Test
	public void testGetTalksByPageAndTuidOrderByTdate() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("tuid", 374486001);
		map.put("pageStart", 0);
		map.put("pageSize", 5);
		List<Talks> tlist=talksService.getTalksByPageAndTuidOrderByTdate(map);
		for(Talks t:tlist) {
			System.out.println(t);
		}
	}

}
