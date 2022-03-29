<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:remove标签的使用语法</title>
    </head>
  
    <body>
		<%
			pageContext.setAttribute("name1","张三");
			request.setAttribute("name2","李四");
			session.setAttribute("name3","王五");
			application.setAttribute("name4","赵六");
		%>
		<!-- 使用el表达式  -->
		${name1} ${name2}  ${name3}  ${name4}
		<br/>
		${pageScope.name1} ${requestScope.name2}  ${sessionScope.name3}  ${applicationScope.name4}
		<hr/>
		<!-- 使用c:out标签 -->
		<c:out value="${name1}"></c:out>
		<hr/>
		<!-- 使用java代码 -->
		<%=pageContext.getAttribute("name1") %>
		
		<hr/>
		<!-- 使用c:remove删除域对象中的属性 
			 var=""指定要删除的域对象中属性名--key值
			 scope=""指定哪个域对象
		-->
		<c:remove var="name1" scope="page"/>
		<hr/>
		1:${name1} 2:${name2}  3:${name3}  4:${name4}
		<c:remove var="name3" scope="session"/>
		<hr/>
		1:${name1} 2:${name2}  3:${name3}  4:${name4}
		
    </body>
</html>