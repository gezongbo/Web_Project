<%@page pageEncoding="utf-8"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>员工信息显示首页</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
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
							<a href="#">首页</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						欢迎!
					</h1>
					
					<%
					     ResultSet rs=(ResultSet)request.getAttribute("rs");
					     //out.println("获得的结果集是："+rs);
					     while(rs.next()){
					    	 out.println(rs.getInt("id")+","+rs.getString("name"));
					     }
					%>
					
					<table class="table">
						<tr class="table_header">
							<td>
								工号
							</td>
							<td>
								姓名
							</td>
							<td>
								工资
							</td>
							<td>
								年龄
							</td>
							<td>
								操作
							</td>
						</tr>
						<tr class="row1">
							<td>
								1
							</td>
							<td>
								zhangshan
							</td>
							<td>
								20000
							</td>
							<td>
								20
							</td>
							<td>
								<a href="emplist.html">删除员工</a>&nbsp;<a href="updateEmp.html">修改员工</a>
							</td>
						</tr>
						<tr class="row2">
							<td>
								2
							</td>
							<td>
								lishi
							</td>
							<td>
								20000
							</td>
							<td>
								20
							</td>
							<td>
								<a href="emplist.html">删除员工</a>&nbsp;<a href="updateEmp.html">修改员工</a>
							</td>
						</tr>
					</table>
					<p>
						<input type="button" class="button" value="添加员工" onclick="location='addEmp.html'"/>
					</p>
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
