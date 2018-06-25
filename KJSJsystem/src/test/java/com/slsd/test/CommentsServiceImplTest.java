package com.slsd.test;


import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.entity.Comments;
import com.slsd.entity.Talks;
import com.slsd.entity.Users;
import com.slsd.service.CommentsService;
import com.slsd.service.TalksService;
import com.slsd.service.UsersService;

public class CommentsServiceImplTest {

	private CommentsService commentsService;
	private TalksService talksService;
	private  UsersService usersService ;
	
	@SuppressWarnings("resource")
	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		commentsService= (CommentsService) ctx.getBean("commentsService");
		talksService=(TalksService) ctx.getBean("TalksService");
		usersService =(UsersService) ctx.getBean("UsersService");
	}
	
	@Test
	public void testAddComments() {
		Talks talk =talksService.getTalksByTid(4);
		Users users=usersService.getUsersByUid(1112);
		Comments comment=commentsService.getCommentsByCid(4);
		Comments comments=new Comments(talk, users, "test", comment, new Date());
		boolean flag=commentsService.addComments(comments);
		System.out.println(flag);
	}

	@Test
	public void testDelComments() {
		boolean flag=commentsService.delComments(5);
		System.out.println(flag);
	}

	@Test
	public void testEditComments() {
		Comments comments=commentsService.getCommentsByCid(7);
		comments.setCdate(new Date());
		boolean flag=commentsService.editComments(comments);
		System.out.println(flag);
	}

	@Test
	public void testGetCommentsByCid() {
		Comments comment=commentsService.getCommentsByCid(7);
		System.out.println(comment);
	}

	@Test
	public void testGetCommentsByCtidOrderByCdate() {
		List<Comments> clist=commentsService.getCommentsByCtidOrderByCdate(2);
		System.out.println(clist.size());
	}

	@Test
	public void testGetCommentsByCuidOrderByCdate() {
		List<Comments> clist=commentsService.getCommentsByCuidOrderByCdate(374486001);
		System.out.println(clist.size());
	}

}
