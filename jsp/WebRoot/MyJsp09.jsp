<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>使用pageContext隐式对象、四大域对象</title>
    </head>
  
    <body>
		<%
		     //往pageContext域对象中存数据
		     pageContext.setAttribute("a",1);
		     //依次往request session和application域对象中存数据
		     request.setAttribute("b",2);
		     session.setAttribute("c",3);
		     application.setAttribute("d",4);
		     //转发技术，由当前09转发到10.jsp页面
		     //request.getRequestDispatcher("MyJsp10.jsp").forward(request,response);
		%>
	

		<!-- 在当前页面获取域对象中的数据 -->
		a的值为:<%=pageContext.getAttribute("a") %> 
        b的值为:<%=request.getAttribute("b") %>
        c的值为:<%=session.getAttribute("c") %>
        d的值为:<%=application.getAttribute("d") %>

    </body>
</html>