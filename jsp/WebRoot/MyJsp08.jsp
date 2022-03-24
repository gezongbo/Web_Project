<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>application隐式对象</title>
    </head>
  
    <body>
		<!-- 从applicatio域对象中取数据 -->
		<%=application.getAttribute("name") %>
		
		
    </body>
</html>