package com.slsd.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.entity.Friends;
import com.slsd.entity.Users;
import com.slsd.service.FriendsService;
import com.slsd.service.UsersService;


public class FriendsServiceImplTest {
	
	private FriendsService friendsService;
	private  UsersService usersService ;
	
	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		friendsService=(FriendsService) ctx.getBean("FriendsService");
		usersService =(UsersService) ctx.getBean("UsersService");
	}
	
	
	@Test
	public void testAddFriends() {
		Date fvisttime=new  Date();
		Users user =usersService.getUsersByUid(374486001);
		Users user2=usersService.getUsersByUid(1113);
		Friends friends=new Friends( user, user2, Integer.toString(user2.getUid()), 0, fvisttime);
		boolean flag=friendsService.addFriends(friends);
		System.out.println(flag);
	}

	@Test
	public void testDelFriends() {
		boolean flag=friendsService.delFriends(3);
		System.out.println(flag);
	}

	@Test
	public void testEditFriends() {
		Friends friends=friendsService.getFriendsByFid(4);
		System.out.println(friends);
		friends.setFvisttime(new Date());
		boolean flag=friendsService.editFriends(friends);
		System.out.println(flag);
	}

	@Test
	public void testGetFriendsByFuid() {
		List<Friends> flist=friendsService.getFriendsByFuid(374486001);
		for(Friends f:flist) {
			System.out.println(f);
		}
	}

	@Test
	public void testGetFriendsByFid() {
		Friends friends=friendsService.getFriendsByFid(4);
		System.out.println(friends);
	}

	@Test
	public void testGetFriendsByPageAndFuidOrderByFvisttime() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("fuid", 374486001);
		map.put("pageStart", 0);
		map.put("pageSize", 5);
		List<Friends> flist=friendsService.getFriendsByPageAndFuidOrderByFvisttime(map);
		for(Friends f:flist) {
			System.out.println(f);
		}
	}

	@Test
	public void testGetFriendsByPageAndFuidOrderByfdegree() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("fuid", 374486001);
		map.put("pageStart", 0);
		map.put("pageSize", 5);
		List<Friends> flist=friendsService.getFriendsByPageAndFuidOrderByfdegree(map);
		for(Friends f:flist) {
			System.out.println(f);
		}
	}

}
