<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Portfolio | Corlate</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/liuyanban.css" rel="stylesheet" >
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->
<body>

    <header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +0123 456 70 90</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container-->
        </div><!--/.top-bar-->

        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>
                </div>
                
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li><a href="index.html">主页</a></li>
                        <li><a href="blog.html">朋友圈</a></li>
                        <li><a href="blog-item.html">说说</a></li>
                        <li class="active"><a href="portfolio.html">留言板</a></li>
                        <li><a href="info?id=1112">个人资料</a></li> 
                        <li><a href="shortcodes.html">相册</a></li>   　　　                    
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
        
    </header><!--/header-->
    <section id="portfolio">
        <div class="container">
            <div class="userinfo">
                		<div class="usertop" style="padding-top:1px;">
                			<h2>留言板</h2>
                		</div>
                		<div class="liuyan">
                			<form>
                				<textarea rows="5" cols="130" style="margin-left: 20px;margin-top:30px;" >包括薪水待遇、工作地点等。 </textarea>
                				<input type="submit" value="发表" style="margin-left: 890px;"/>
                			</form>
                		</div>
                		<h3 style="padding-left:10px;">留言(22)</h3>
                		<hr />
                		<div class="getliuyan">
                			<table>
                				<tr>
                					<td style="padding-left: 10px;width: 100px;padding-top: 30px;">
                						<img src="images/blog/avatar.jpg" style="width: 100px;height: 100px;">
                						<span style="padding-left: 30px;">昵称</span>
                					</td>
                					<td colspan="3" style="padding-left: 50px;">
                						kkkkkkkkkkkkkkkkkkkkkkhhhhh
                					</td>
                				</tr>
                				<tr>
                					<td style="padding-left: 10px;width: 100px;padding-top: 30px;">
                						<img src="images/blog/avatar.jpg" style="width: 100px;height: 100px;">
                						<span style="padding-left: 30px;">昵称</span>
                					</td>
                					<td colspan="3" style="padding-left: 50px;">
                						kkkkkkkkkkkkkkkkkkkkkk
                					</td>
                				</tr>
                				<tr>
                					<td style="padding-left: 10px;width: 100px;padding-top: 30px;">
                						<img src="images/blog/avatar.jpg" style="width: 100px;height: 100px;">
                						<span style="padding-left: 30px;">昵称</span>
                					</td>
                					<td colspan="3" style="padding-left: 50px;">
                						kkkkkkkkkkkkkkkkkkkkkk
                					</td>
                				</tr>
                				<tr>
                					<td style="padding-left: 10px;width: 100px;padding-top: 30px;">
                						<img src="images/blog/avatar.jpg" style="width: 100px;height: 100px;">
                						<span style="padding-left: 30px;">昵称</span>
                					</td>
                					<td colspan="3" style="padding-left: 50px;">
                						kkkkkkkkkkkkkkkkkkkkkk
                					</td>
                				</tr>
                				<tr>
                					<td style="padding-left: 10px;width: 100px;padding-top: 30px;">
                						<img src="images/blog/avatar.jpg" style="width: 100px;height: 100px;">
                						<span style="padding-left: 30px;">昵称</span>
                					</td>
                					<td colspan="3" style="padding-left: 50px;">
                						kkkkkkkkkkkkkkkkkkkkkk
                					</td>
                				</tr>
                			</table>
                			<div class="fenye">
	                			<a href="IndexServlet?op=allTopic&currentIndex=${currentIndex-1}">上一页</a>
	                			${currentIndex}/${totalPage} 当前页/总页码&nbsp;&nbsp;&nbsp;
								<a href="IndexServlet?op=allTopic&currentIndex=${currentIndex+1}">下一页</a>
							</div>
                		</div>
                	</div>
                    </div><!--/.portfolio-item-->
    </section><!--/#portfolio-item-->
    
    <section id="bottom">
        <div class="container wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="widget">
                        <h3>Company</h3>
                        <ul>
                            <li><a href="#">About us</a></li>
                            <li><a href="#">We are hiring</a></li>
                            <li><a href="#">Meet the team</a></li>
                            <li><a href="#">Copyright</a></li>
                            <li><a href="#">Terms of use</a></li>
                            <li><a href="#">Privacy policy</a></li>
                            <li><a href="#">Contact us</a></li>
                        </ul>
                    </div>    
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <div class="widget">
                        <h3>Support</h3>
                        <ul>
                            <li><a href="#">Faq</a></li>
                            <li><a href="#">Blog</a></li>
                            <li><a href="#">Forum</a></li>
                            <li><a href="#">Documentation</a></li>
                            <li><a href="#">Refund policy</a></li>
                            <li><a href="#">Ticket system</a></li>
                            <li><a href="#">Billing system</a></li>
                        </ul>
                    </div>    
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <div class="widget">
                        <h3>Developers</h3>
                        <ul>
                            <li><a href="#">Web Development</a></li>
                            <li><a href="#">SEO Marketing</a></li>
                            <li><a href="#">Theme</a></li>
                            <li><a href="#">Development</a></li>
                            <li><a href="#">Email Marketing</a></li>
                            <li><a href="#">Plugin Development</a></li>
                            <li><a href="#">Article Writing</a></li>
                        </ul>
                    </div>    
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <div class="widget">
                        <h3>Our Partners</h3>
                        <ul>
                            <li><a href="#">Adipisicing Elit</a></li>
                            <li><a href="#">Eiusmod</a></li>
                            <li><a href="#">Tempor</a></li>
                            <li><a href="#">Veniam</a></li>
                            <li><a href="#">Exercitation</a></li>
                            <li><a href="#">Ullamco</a></li>
                            <li><a href="#">Laboris</a></li>
                        </ul>
                    </div>    
                </div><!--/.col-md-3-->
            </div>
        </div>
    </section><!--/#bottom-->

    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    &copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
                </div>
                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="#">Contact Us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
</body>
</html>