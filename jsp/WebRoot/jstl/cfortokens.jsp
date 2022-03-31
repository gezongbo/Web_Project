<%@page pageEncoding="utf-8"%>
<%@page import="java.util.Arrays"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:forTokens标签的使用语法</title>
    </head>
  
    <body>
		<!-- 将字符串"www.baidu.com"放入域对象中存储 -->
		<!-- java代码 的方式 -->
		<%-- 
		<%
			request.setAttribute("url","www.baidu.com");
		%>
		--%>
		<!-- jstl标签的方式 c:set -->
		<%-- 
		<c:set var="url" value="www.baidu.com" scope="request"></c:set>
		--%>
		<c:set var="url" scope="request">
			www.baidu.com
		</c:set>
	
		${url}
		<hr/>
		<!-- 使用c:forTokens标签:将url的值www.baidu.com根据.进行分割，获取分割后的每一部分内容 
			 items=""所要操作的字符串，使用el表达式来获取
			 delims=""定义符号对字符串进行分割
			 var=""分割以后，分割的每一部分内容
		-->
		<c:forTokens items="${url}" delims="." var="s">
			 ${s}
			 <br/>
		</c:forTokens>
		
		<hr/>
		<!-- 使用java代码的方式对字符串进行分割 -->
		<%
			String strUrl=(String)request.getAttribute("url");
			out.println(strUrl);
			//www.baidu.com
			String[] ss=strUrl.split("\\.");
			out.println(Arrays.toString(ss));
		%>
		
		
		
		
		
		
    </body>
</html>





