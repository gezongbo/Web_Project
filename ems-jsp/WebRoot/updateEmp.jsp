<%@page pageEncoding="utf-8"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>修改员工</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2009/11/20
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						修改员工的信息:
					</h1>
					<%
						//out.println(request.getAttribute("rs"));
					    ResultSet rs=(ResultSet)request.getAttribute("rs");
					    if(rs.next()){
					%>
					    <form action="update" method="post">
							<table cellpadding="0" cellspacing="0" border="0"
								class="form_table">
								<tr>
									<td valign="middle" align="right">
										工号:
									</td>
									<td valign="middle" align="left">
										<%=rs.getInt("id") %>
										<!--  
										<input type="text" name="id" value="<%=rs.getInt("id") %>"/>
										-->
										<input type="hidden" name="id" value="<%=rs.getInt("id") %>"/>
									</td>
								</tr>
								<tr>
									<td valign="middle" align="right">
										姓名:
									</td>
									<td valign="middle" align="left">
										<input type="text" class="inputgri" name="name" value="<%=rs.getString("name") %>"/>
									</td>
								</tr>
								<tr>
									<td valign="middle" align="right">
										工资:
									</td>
									<td valign="middle" align="left">
										<input type="text" class="inputgri" name="salary" value="<%=rs.getDouble("salary") %>"/>
									</td>
								</tr>
								<tr>
									<td valign="middle" align="right">
										年龄:
									</td>
									<td valign="middle" align="left">
										<input type="text" class="inputgri" name="age" value="<%=rs.getInt("age") %>"/>
									</td>
								</tr>
							</table>
							<p>
								<input type="submit" class="button" value="修改" />
							</p>
						</form>
				    <% 	
					    }
					%>
					
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>