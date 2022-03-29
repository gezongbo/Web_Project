<%@page pageEncoding="utf-8"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:out标签库的使用</title>
    </head>
  
    <body>
		<h3>输出常量</h3>
		<!-- java代码的方式 -->
		<%=100 %>
		<%  out.println(100);  %>
		<!-- 直接在页面中写 -->
		100
		<!-- 使用el表达式 -->
		${200}
		<!-- jstl标准标签库的方式 -->
		<c:out value="300"></c:out>
		
		<h3>输出作用域中存储的数据</h3>
		<%
		    String name="张三"; 
			pageContext.setAttribute("name",name); 
			session.setAttribute("name1","李四");
			request.setAttribute("date",new Date());
		%>
		<!-- java代码的方式 -->
		<%=pageContext.getAttribute("name") %>
		<%=session.getAttribute("name1") %>
		<%=request.getAttribute("date") %>
		<br/>
		<!-- el表达式的方式 -->
		<!-- 省略写法 -->
		${name}  ${name1}   ${date}
		<br/>
		<!-- 不省略写法，使用xxScope -->
		${pageScope.name}  ${sessionScope.name1}  ${requestScope.date}
		<br/>
		<!-- jstl标准标签库的方式 -->
		<c:out value="${name}"></c:out>
		<c:out value="${name1}"></c:out>
		<c:out value="${date}"></c:out>
		
		<h3>转义输出</h3>
		<!-- 不转义 -->
		<c:out value="<a href='http://www.baidu.com'>baidu</a>" escapeXml="true"></c:out>
		<!-- 转义 -->
		<c:out value="<a href='http://www.baidu.com'>baidu</a>" escapeXml="false"></c:out>
		
		<h3>输出默认值</h3>
		<c:out value="${m}" default="hello"></c:out>
    </body>
</html>








