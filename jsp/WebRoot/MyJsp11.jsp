<%@page pageEncoding="utf-8"  errorPage="MyJsp12.jsp"%>
<html>
    <head>
         <title>exception隐式对象</title>
    </head>
  
    <body>
		<%
		   out.println(5/0);
		%>
    </body>
</html>