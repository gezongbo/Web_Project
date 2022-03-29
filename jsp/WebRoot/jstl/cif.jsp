<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:if标签的使用语法</title>
    </head>
  
    <body>
		<%
			//一种情况的判断
			int a=4;
			if(a%2==0){
				out.println("是偶数");
			}else{
				out.println("是奇数");
			}
		
			if(a>0){
				out.println("正数");
			}
			
			//两种情况的判断  if...else...
			if(a>0){
				out.println("正数");
			}else{
				out.println("负数");
			}
			//多种情况的判断  if...else if...else if...else...
		%>
		<hr/>
		<!-- c:if标签 
			 test=""写入判断条件，判断条件要写入el表达式里
			 var="" 指定存入域对象的key值
			 scope=""指定test中el表达式的结果存储在哪个域对象中  page  request  session  application
			 相当于执行了如下代码：request.setAttribute("f","true");
		-->
		<!-- 如果条件是真的，输出hello;如果条件是假的，输出olleh -->
		<c:if test="${3<2}" var="f" scope="request">
			hello
		</c:if>
		<br/>
		${f}
		${!f}
		<br/>
		<c:if test="${!f}">
			olleh
		</c:if>
		
    </body>
</html>