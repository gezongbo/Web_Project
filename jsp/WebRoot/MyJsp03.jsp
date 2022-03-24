<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>演示JSP中的九大隐式对象</title>
    </head>
  
    <body>
		<!-- 使用request隐式对象获取域对象存储的值 -->
		获取的年龄为:<%=request.getAttribute("age") %>
		<!-- 方式2 -->
		<%
		   out.println(request.getAttribute("age"));
		%>
		<!-- 方式3 -->
		<%
		   Integer itgAge=(Integer)request.getAttribute("age");
		   out.println(itgAge);
		%>
		
		
		
		
    </body>
</html>