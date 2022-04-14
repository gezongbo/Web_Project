<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.lddx.bean.Cart"%>
<%@page import="com.lddx.bean.BookItem"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <%
    	Cart cart=(Cart)session.getAttribute("cart");
    	ArrayList<BookItem> itemList=cart.getItemList();
    	out.println(itemList);
    %>
    
    
    
  </body>
</html>
