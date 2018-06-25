package com.slsd.test;


import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.entity.Likes;
import com.slsd.entity.Talks;
import com.slsd.entity.Users;
import com.slsd.service.LikesService;
import com.slsd.service.TalksService;
import com.slsd.service.UsersService;

public class LikesServiceImplTest {
	
	private LikesService likesService;
	private TalksService talksService;
	private  UsersService usersService ;
	
	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		likesService= (LikesService) ctx.getBean("LikesService");
		talksService =(TalksService) ctx.getBean("TalksService");
		usersService =(UsersService) ctx.getBean("UsersService");
	}
	
	
	@Test
	public void testAddLikes() {
		Talks talk=talksService.getTalksByTid(4);
		Users user= usersService.getUsersByUid(374486002);
		Likes likes =new Likes(talk, user, new Date());
		boolean flag=likesService.addLikes(likes);
		System.out.println(flag);
	}

	@Test
	public void testDelLikes() {
		boolean flag=likesService.delLikes(5);
		System.out.println(flag);
	}

	@Test
	public void testEditLikes() {
		Likes likes=likesService.getLikesByLid(6);
		likes.setLdate(new Date());
		boolean flag=likesService.editLikes(likes);
		System.out.println(flag);
	}

	@Test
	public void testGetLikesByLid() {
		Likes likes= likesService.getLikesByLid(6);
		System.out.println(likes);
	}

	@Test
	public void testGetLikesByLtid() {
		List<Likes> llist=likesService.getLikesByLtid(2);
		System.out.println(llist.size());
	}

	@Test
	public void testGetLikesByLtidOrderByLdate() {
		List<Likes> llist=likesService.getLikesByLtidOrderByLdate(2);
		System.out.println(llist.size());
	}

	@Test
	public void testGetLikesByLuidOrderByLdate() {
		List<Likes> llist=likesService.getLikesByLuidOrderByLdate(374486001);
		System.out.println(llist.size());
	}

}
