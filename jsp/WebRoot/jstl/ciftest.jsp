<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>使用c:if标签判断一个数是奇数还是偶数</title>
    </head>
  
    <body>
		<%
			//数据的模拟
			int num=7;
			//把num放入域对象中
			pageContext.setAttribute("num",num);
		%>
		num:${num}
		<br/>
		<!-- 使用c:if标签判断num是奇数还是偶数 -->
		<!-- 底层相当于执行了一行代码：pageContext.setAttribute("flag","test的计算结果"); -->
		<c:if test="${num%2==0}" var="flag" scope="page">
			<div style="color:red">${num}是偶数</div>
		</c:if>
		<c:if test="${!flag}">
			<div style="color:blue">${num}是奇数</div>
		</c:if>
    </body>
</html>