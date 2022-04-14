<%@page pageEncoding="utf-8"%>
<%@page import="com.lddx.bean.Cart"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		 <meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/book.css" rel="stylesheet" type="text/css" />
		<link href="css/second.css" rel="stylesheet" type="text/css" />
		<link href="css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="css/shopping_vehicle.css" rel="stylesheet"
			type="text/css" />
		<link href="css/public_footer.css" rel="stylesheet" type="text/css" />
		<!-- 引入jquery框架 -->
		<script type="text/javascript" src="js/jquery-1.4.3.js"></script> 
		<script type="text/javascript">
			//延迟加载函数
			$(function(){
				//对变更数量的输入框进行数字验证
				$(".update").click(function(){
					//思路：1、获取变更输入框输入的内容
					//    2、使用正则表达式对内容进行数字验证
					//    3、验证不通过，提示必须是数字；如果验证通过，向对应服务器端的Servlet发送请求
					//获得书的id是多少
					var id=$(this).attr("id");
					//alert(id);
					var num=$("#num"+id).val();  //输入框输入的内容
					//alert(num);
					var reg=/^[1-9][0-9]*$/;
				    if(reg.test(num)){    //验证通过的情况 
				    	//xxxxx?num=5&id=2
				    	window.location.href="cartupdate?num="+num+"&id="+id;
				    }else{  //验证不通过的情况
				    	alert("您输入的必须是数字");	
				    }
				});
			});
		</script>
	</head>
	<body>
		<br />
		<br />
		<div class="my_shopping">
			<img class="pic_shop" src="images/pic_myshopping.gif" />
		</div>
		
	
		<c:choose>
			<%-- 没有选购任何商品的情况 --%>
			<c:when test="${empty itemList}">
			    <!-- 还没有购选任何商品的开始 -->
				<div id="div_no_choice">
				<div class="choice_title"></div>
				<div class="no_select">
					您还没有选购任何商品[
					<a href='booklist'> 继续挑选商品&gt;&gt;</a>]
				</div>
				</div>
				<!-- 还没有购选任何商品的结束 -->
			</c:when>
			<%-- 选购商品的情况下，要将购物车区域显示出来 --%>
			<c:otherwise>
		<!-- 购物车区域的开始 -->
		<div id="div_choice" class="choice_merch">
			<h2 id="cart_tips">
				您已选购以下商品
			</h2>
			<div class="choice_bord">
				<table class="tabl_buy" id="tbCartItemsNormal">
					<tr class="tabl_buy_title">
						<td>
							商品id
						</td>
						<td class="buy_td_6">
							<span>图片</span>
						</td>
						<td>
							<span class="span_w1">商品名</span>
						</td>
						<td class="buy_td_5">
							<span class="span_w2">市场价</span>
						</td>
						<td class="buy_td_4">
							<span class="span_w3">当当价</span>
						</td>
						<td class="buy_td_1">
							<span class="span_w2">数量</span>
						</td>
						<td class="buy_td_2">
							<span>变更数量</span>
						</td>
						<td class="buy_td_1">
							<span>删除</span>
						</td>
					</tr>
					<tr class='objhide'>
						<td colspan="8">
							&nbsp;
						</td>
					</tr>

				  <c:forEach items="${itemList}" var="item">
					  <tr class='td_no_bord'>
						<td>
							&nbsp;${item.book.id}
						</td>
						<td class="buy_td_6">
							<span><img src="productImages/${item.book.productPic}" width="30px" height="30px"/> </span>
						</td>
						<td>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.book.productName}
						</td>
						<td class="buy_td_5">
							<span class="c_gray">${item.book.fixedPrice}</span>
						</td>
						<td class="buy_td_4">
							&nbsp;&nbsp;
							<span>${item.book.dangPrice} </span>
						</td>
						<td class="buy_td_1">
							&nbsp;&nbsp;${item.count}
						</td>

						<td>
							<input class="del_num" type="text" size="3"	id="num${item.book.id}" value="" />
							<a class="update" id="${item.book.id}">变更</a>
						</td>
						<td>
							<a href="cartdelete?id=${item.book.id}">删除</a>
						</td>
					</tr>
			 </c:forEach>
					
					
					
					<!-- 购物列表结束 -->
				</table>
				<div class="choice_balance">
					<div class="select_merch">
						<a href='booklist'> 继续挑选商品&gt;&gt;</a>
					</div>
					<div class="total_balance">
						<div class="save_total">
							您共节省：
							<span class="c_red"> 
								￥
								<span id="total_economy">
									<%-- 
									<% 
										Cart cart=(Cart)session.getAttribute("cart");
										double totalSave=cart.getTotalSave();
										out.println(totalSave);
									%>
									--%>
									${totalSave}
								</span> 
							</span>
							<span id='total_vip_economy' class='objhide'> ( 其中享有优惠： <span
								class="c_red"> ￥<span id='span_vip_economy'>0.00</span> </span>
								) </span>
							<span style="font-size: 14px">|</span>
							<span class="t_add">商品金额总计：</span>
							<span class="c_red_b"> ￥<span id='total_account'>${totalPrice}</span>
							</span>
						</div>
						<div id="balance" class="balance">
							<a name='checkout' href='order/toOrder.action'> <img
									src="images/butt_balance.gif" alt="结算" border="0" title="结算" />
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 购物车区域的结束 -->
			</c:otherwise>
		</c:choose>
		
	
		
		
		
		
		
		<!-- 用户删除恢复区 -->

		<div id="divCartItemsRemoved" class="del_merch">

		</div>
		<br />
		<br />
		<br />
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
