<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
 	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/book.css" rel="stylesheet" type="text/css" />
		<link href="css/second.css" rel="stylesheet" type="text/css" />
		<link href="css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="css/list.css" rel="stylesheet" type="text/css" />
		<link href="css/book_head090107.css" rel="stylesheet"
			type="text/css" />
		<link href="css/public_footer.css" rel="stylesheet" type="text/css" />
	</head>
	<body>

		<div style="width: 962px; margin: auto;">
			<a href="#"><img src="images/default/book_banner_081203.jpg"
					border="0" /> </a>
		</div>
		<!-- 头部开始 -->
		<div class="head_container">
			<div class="head_welcome">
				<div class="head_welcome_right">
					<span class="head_welcome_text"> </span>
					<span class="head_welcome_text"> 
						<!-- 用户没有登录的情况显示：|登录|注册| -->
						<!-- 用户登录的情况显示：|亲，欢迎xxxx|退出| -->
						<!-- 根据${user}结果，如果结果为null，说明没有登录过，显示登录，注册
						                                                 如果结果不为null，说明是登录过的，显示欢迎xxx，退出
						             可以使用jstl标准标签库中的c:if，也可以使用c:choose
						 -->
						 <c:choose>
						 	<%-- user为null的情况 --%>
						 	<c:when test="${empty user}">
						 		<span class="little_n">
									| <a href="login.jsp" name="mydangdang" class="head_black12a">登录</a> |
									<a href="register.jsp" name="helpcenter" class="head_black12a"
									target="_self">注册</a> | 
								</span>
						 	</c:when>	
						 	<%-- user不为null的情况 --%>
						 	<c:otherwise>
						 		<span class="little_n">
									| 亲，欢迎${user.nickname} |
									<a href="logout" name="helpcenter" class="head_black12a"
									target="_self">退出</a> | 
								</span>
						 	</c:otherwise>
						 </c:choose>	 
					</span>
					<div class="cart gray4012">
						<a href="cart.html">购物车</a>
					</div>
				</div>
			</div>
			<div class="head_head_list">
				<div class="head_head_list_left">
					<span class="head_logo"><a href="#" name="backtobook"><img
								src="images/booksaleimg/book_logo.gif" /> </a> </span>
				</div>
				<div class="head_head_list_right">

					<div class="head_head_list_right_b">
					</div>
				</div>
			</div>
		</div>
		<!-- 头部结束 -->

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
			</div>
			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">

					<div id="book_list" class="list_r_title">
						<div>
							您现在的位置:&nbsp;
							<a href="#" style="font-size: 12pt;font-family: sans-serif;color: white">图书热卖场</a>
						</div>
					</div>
					<div style="text-align:center">
						<!-- page==1成立，说明是第1页，就不能在点上一页了 -->
						<c:if test="${page==1}" var="f">
							<span style="color:red">上一页</span>
						</c:if>
						<!-- !f说明page的值不等于1的情况 -->
						<c:if test="${!f}">
							<a href="listpage?page=${page}&start=${start}&a=0">上一页</a>
						</c:if>
						&nbsp;&nbsp;
						第${page}页
						&nbsp;&nbsp;
						共${totalPages}页
						&nbsp;&nbsp;
						<!-- 该条件如果成立，说明当前页和总多少页是一样的，已经到了最后一页 -->
						<c:if test="${page==totalPages}" var="m">
							<span style="color:red">下一页</span>
						</c:if>
						<c:if test="${!m}">
							<a href="listpage?page=${page}&start=${start}&a=1">下一页</a>
						</c:if>
					</div>

					<!--商品条目开始-->
					<div class="list_r_line"></div>
					<div class="clear"></div>

					<!-- 使用jstl标准标签库将集合books中的所有图书循环显示出来 -->
					<c:forEach items="${books}" var="b">
					  <div class="list_r_list">
						<span class="list_r_list_book"><a target='_blank'
							name="link_prd_img" href='#'> <img
									title="${b.productName}" class="dang_img"
									src='productImages/${b.productPic}' /> </a> </span>
						<h2>
							<a target='_blank' name="link_prd_name"
								href='#'>${b.productName}</a>
						</h2>
						<h3>
							顾客评分：100
						</h3>
						<h4 class="list_r_list_h4">
							作 者:
							<a href='#' name='作者'>${b.author}</a>
						</h4>
						<h4>
							出版社：
							<a href='#' name='出版社'>${b.publishing}</a>
						</h4>
						<h4>
							出版日期：${b.publishTime}
						</h4>
						<h5>
							${b.description}
						</h5>
						<div class="clear"></div>
						<h6>
							<span class="del">定价${b.fixedPrice}</span>
							<span class="red">当当价${b.dangPrice}</span> 节省：￥${b.saveMoney}
						</h6>
						<span class="list_r_list_button"> <img align="top"
								src='images/buttom_goumai.gif'
								onclick="javascript:window.location.href='cart.html'" /> </span>
						<span id="cartInfo_1"></span>
					  </div>
					</c:forEach>

					
					
					
					
					
					<!-- 
					<div class="list_r_list">
						<span class="list_r_list_book"><a target='_blank'
							name="link_prd_img" href=''> <img
									title="上课头疼的故事" class="dang_img"
									src='productImages/2.jpg' /> </a> </span>
						<h2>
							<a target='_blank' name="link_prd_name"
								href='product.action?id=2'>上课头疼的故事2</a>
						</h2>
						<h3>
							顾客评分：100
						</h3>
						<h4 class="list_r_list_h4">
							作 者:
							<a href='#' name='作者'>我写的</a>
						</h4>
						<h4>
							出版社：
							<a href='#' name='出版社'>地球出版社</a>
						</h4>
						<h4>
							出版日期：2011-11-11
						</h4>
						<h5>
							这真是一本好书啊
						</h5>
						<div class="clear"></div>
						<h6>
							<span class="del">定价</span>
							<span class="red">当当价</span> 节省：￥200
						</h6>
						<span class="list_r_list_button"> <img align="top"
								src='images/buttom_goumai.gif'
								onclick="javascript:window.location.href='cart.html'" /> </span>
						<span id="cartInfo_2"></span>
					</div>
					
					
					
					<div class="list_r_list">
						<span class="list_r_list_book"><a target='_blank'
							name="link_prd_img" href=''> <img
									title="上课睡觉的故事" class="dang_img"
									src='productImages/3.jpg' /> </a> </span>
						<h2>
							<a target='_blank' name="link_prd_name"
								href='product.action?id=3'>上课睡觉的故事3</a>
						</h2>
						<h3>
							顾客评分：100
						</h3>
						<h4 class="list_r_list_h4">
							作 者:
							<a href='#' name='作者'>我写的</a>
						</h4>
						<h4>
							出版社：
							<a href='#' name='出版社'>地球出版社</a>
						</h4>
						<h4>
							出版日期：
						</h4>
						<h5>
							这真是一本好书啊
						</h5>
						<div class="clear"></div>
						<h6>
							<span class="del">定价</span>
							<span class="red">当当价</span> 节省：￥200
						</h6>
						<span class="list_r_list_button"> <img align="top"
								src='images/buttom_goumai.gif'
								onclick="javascript:window.location.href='cart.html'" /> </span>
						<span id="cartInfo_3"></span>
					</div>
					
					
					
					<div class="list_r_list">
						<span class="list_r_list_book"><a target='_blank'
							name="link_prd_img" href=''> <img
									title="上课睡觉的故事" class="dang_img"
									src='productImages/4.jpg' /> </a> </span>
						<h2>
							<a target='_blank' name="link_prd_name"
								href='product.action?id=4'>上课睡觉的故事4</a>
						</h2>
						<h3>
							顾客评分：100
						</h3>
						<h4 class="list_r_list_h4">
							作 者:
							<a href='#' name='作者'>我写的</a>
						</h4>
						<h4>
							出版社：
							<a href='#' name='出版社'>地球出版社</a>
						</h4>
						<h4>
							出版日期：
						</h4>
						<h5>
							这真是一本好书啊
						</h5>
						<div class="clear"></div>
						<h6>
							<span class="del">定价</span>
							<span class="red">当当价</span> 节省：￥200
						</h6>
						<span class="list_r_list_button"> <img align="top"
								src='images/buttom_goumai.gif'
								onclick="javascript:window.location.href='cart.html'" /> </span>
						<span id="cartInfo_4"></span>
					</div>
					-->
					
					<div class="clear"></div>
					<!--商品条目结束-->

					<div class="clear"></div>
					<div id="divBottomPageNavi" class="fanye_bottom">
					</div>

				</div>
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->

		<div class="public_footer">
			<div class="public_footer_bottom">
				<div class="public_footer_icp" style="line-height: 48px;">
					Copyright (C) 当当网 2004-2008, All Rights Reserved
					<a href="#" target="_blank"><img
							src="images/bottom/validate.gif" border="0" align="middle" />
					</a>
					<a href="#" target="_blank" style="color: #666;">京ICP证041189号</a>
				</div>
			</div>
		</div>
		<!--页尾结束 -->
	</body>
</html>
