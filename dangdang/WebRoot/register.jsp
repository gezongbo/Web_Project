<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户注册 - 当当网</title>
		<link href="css/login.css" rel="stylesheet" type="text/css" />
		<link href="css/page_bottom.css" rel="stylesheet" type="text/css" />
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<!-- 引入jquery框架 -->
		<script type="text/javascript" src="js/jquery-1.4.3.js"></script> 
		<!-- 引入自己定义的register.js文件 -->
		<script type="text/javascript" src="js/register.js"></script>
	</head>
	<body>
		<div class="login_top">
			<a href="booklist.html" target="_blank"><img class="logo"
					src="images/logo.gif" /> </a>
		</div>
		<div class="login_step">
			注册步骤:
			<span class="red_bold">1.填写信息</span> &gt; 2.注册成功
		</div>
		<div class="fill_message">
			<form name="ctl00" method="post" action="regist" id="f">
				<h2>
					以下均为必填项
				</h2>
				<table class="tab_login">
					<tr>
						<td valign="top" class="w1">
							请填写您的Email地址：
						</td>
						<td>
							<input type="text" name="email" id="email" class="text_input">
							<div class="text_left" id="emailValidMsg">
								<p>
									请填写有效的Email地址，在下一步中您将用此邮箱接收验证邮件。
								</p>
								<span id="emailInfo" style="color: red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置您在当当网的昵称：
						</td>
						<td>
							<input type="text" name="nickname" id="txtNickName"
								class="text_input">
							<div class="text_left" id="nickNameValidMsg">
								<p>
									您的昵称可以由小写英文字母、中文、数字组成，
								</p>
								<p>
									长度4－20个字符。
								</p>
								<span id="nameInfo" style="color: red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置密码：
						</td>
						<td>
							<input type="password" name="password" id="txtPassword"
								class="text_input">
							<div class="text_left" id="passwordValidMsg">
								<p>
									您的密码可以由大小写英文字母、数字组成，长度6－20位。
								</p>
								<span id="passwordInfo" style="color: red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							再次输入您设置的密码：
						</td>
						<td>
							<input type="password" name="password1" id="txtRepeatPass"
								class="text_input">
							<div class="text_left" id="repeatPassValidMsg">
								<span id="password1Info" style="color: red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							验证码：
						</td>
						<td>
							<img class="yzm_img" align="middle" id="validateImage"
								src="codeimage" width="150" height="40"
								onclick="this.src='codeimage?time-'+(new Date()).getTime();" />
							<input type="text" name="validateCode" id="validateCode"
								class="yzm_input">
							<div class="text_left t1">
								<p class="t1">
									<span id="vcodeValidMsg">请输入图片中的验证码。</span> 
									<a href="javascript:"
										onclick="document.getElementById('validateImage').src='codeimage?time-'+(new Date()).getTime();">看不清，再换一张</a>
								</p>
								<span id="numberInfo" style="color: red"></span>
							</div>
						</td>
					</tr>
				</table>
				<div class="login_in">
					<input type="submit" id="btnClientRegister" class="button_1" value="注册">
				</div>
			</form>
		</div>
		<div>
			<center>
				<hr style="height: 1px; width: 972px; color: #cfcfcf" />
				<div class="b_left"></div>
				<div class="publish_bottom_message2">
					<div class="copyright">
						Copyright (C) 当当网 2004-2008, All Rights Reserved
					</div>
					<div class="validate">
						<a
							href="#http://www.hd315.gov.cn/beian/view.asp?bianhao=010202001051000098"
							target="_blank"> <img src="images/validate.gif" border="0" />
						</a>
						<p>
							<a href="" target="_blank">京ICP证041189号</a>
						</p>
					</div>
				</div>
			</center>
		</div>
	</body>
</html>

