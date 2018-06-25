package com.slsd.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.entity.Photos;
import com.slsd.entity.Talks;
import com.slsd.entity.Users;
import com.slsd.service.PhotosService;
import com.slsd.service.TalksService;
import com.slsd.service.UsersService;

public class PhotosServiceImplTest {

	private PhotosService photosService;
	private TalksService talksService;
	private  UsersService usersService;
	
	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		photosService= (PhotosService) ctx.getBean("PhotosService");
		talksService =(TalksService) ctx.getBean("TalksService");
		usersService =(UsersService) ctx.getBean("UsersService");
	}
	
	@Test
	public void testAddPhotos() {
		Users user=usersService.getUsersByUid(1112);
		Talks talk=talksService.getTalksByTid(4);
		Photos photos=new Photos(user, "test.img", "10", talk);
		boolean flag=photosService.addPhotos(photos);
		System.out.println(flag);
	}

	@Test
	public void testDelPhotos() {
		boolean flag=photosService.delPhotos(19);
		System.out.println(flag);
	}

	@Test
	public void testEditPhotos() {
		Photos photos=photosService.getPhotoByPid(20);
		System.out.println(photos);
		boolean flag=photosService.editPhotos(photos);
		System.out.println(flag);
		
	}

	@Test
	public void testGetPhotoByPid() {
		Photos photos=photosService.getPhotoByPid(20);
		System.out.println(photos);
	}

	@Test
	public void testGetPhotosByPuid() {
		List<Photos> plist=photosService.getPhotosByPuid(374486001);
		System.out.println(plist.size());
	}

	@Test
	public void testGetPhotosByPtid() {
		List<Photos> plist=photosService.getPhotosByPtid(4);
		System.out.println(plist.size());
	}

	@Test
	public void testGetPhotosByPuidAndPgroup() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("puid", 374486001);
		map.put("pgroup", "2");
		List<Photos> plist=photosService.getPhotosByPuidAndPgroup(map);
		System.out.println(plist.size());
	}

	@Test
	public void testGetPgroupByPuid() {
		List<String> slist=photosService.getPgroupByPuid(374486001);
		for(String s:slist) {
			System.out.println(s);
		}
	}

}
