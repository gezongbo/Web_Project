<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>el表达式的功能3：从域对象中获取数据</title>
    </head>
  
    <body>
		<!-- 写一段java代码，往域对象中存数据 -->
		<% 
		    pageContext.setAttribute("a",100);
			request.setAttribute("b",200);
			session.setAttribute("c",300);
			application.setAttribute("d",400);
		%>


		<!-- java代码的方式从域对象中获取数据 -->
		<%=pageContext.getAttribute("a") %>
		<%=request.getAttribute("b") %>
		<%=session.getAttribute("c") %>
		<%=application.getAttribute("d") %>
		
		<hr/>
		<!-- el表达式的方式从域对象中获取数据 -->
		${a}  ${b}  ${c}  ${d}
		
		<hr/>
		<!-- el表达式另外一种获取域对象数据的方式 -->
		${pageScope.a}   ${requestScope.b}  ${sessionScope.c}  ${applicationScope.d}
		
		<!-- 一旦用el表达式指定从哪个域中取数据，定要保证name是正确的 -->
		--${pageScope.aa}
		
    </body>
</html>