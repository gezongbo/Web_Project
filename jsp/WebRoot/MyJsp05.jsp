<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>response隐式对象</title>
    </head>
  
    <body>
		<!-- 重定向：浏览器看到的是重定向以后的新地址
		            重定向的地址可以是一个页面，也可以是一个Servlet的url-pattern的地址
		            也可以是已经存在的域名的地址
		 -->
         <%
         	//1、重定向到一个自己的页面
            //response.sendRedirect("MyHtml.html");
         	//response.sendRedirect("index.jsp");
         	//2、重定向到Servlet的url-pattern的地址
         	//response.sendRedirect("/ems-servlet/list");
         	//3、已经存在的域名的地址
         	response.sendRedirect("http://www.baidu.com");
         %>


    </body>
</html>