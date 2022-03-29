<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:choose标签的适用语法</title>
    </head>
  
    <body>
    	<%-- 
		<%
			int day=1;   //星期几
			//将变量day放入域对象中存储
			pageContext.setAttribute("day",day);
		%>
		--%>
		<!-- 标准标签库实现 -->
		<c:set var="day" value="9" scope="page"></c:set>
		
		<!-- 使用el表达式获取变量的值 -->
		${day}
		<hr/>
		<!-- 使用c:choose标签进行多种情况的判断 -->
		<c:choose>
			<c:when test="${day==1}">
				今天是星期一，路上各种堵车
			</c:when>
			<c:when test="${day==2}">
				今天是星期二，还有4天休息
			</c:when>
			<c:when test="${day==3}">
				今天是星期三....
			</c:when>
			<c:otherwise>
				啥也不是
			</c:otherwise>
		</c:choose>
		
    </body>
</html>