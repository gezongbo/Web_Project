<%@page pageEncoding="utf-8" %>
<%@page import="java.util.Date"%>
<html>
    <head>
         <title>response隐式对象：设置文件头</title>
    </head>
  
    <body>
		<!-- 1、设置页面自刷新 -->
		<%
		     response.setHeader("refresh","1");
		%>
                    系统时间为：<span style="color:red;"><%=new Date() %></span>

		<!-- 2、定时跳转 -->
		<%
		    response.setHeader("refresh","5;URL=index.jsp");
		%>

    </body>
</html>