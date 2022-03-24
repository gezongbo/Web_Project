<%@page pageEncoding="utf-8"   %>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<html>
    <head>
         <title>演示JSP中的九大隐式对象</title>
    </head>
  
    <body>
		<!-- 通过request隐式对象获取Cookie对象 -->
		<%
		     Cookie c1=new Cookie("a","1");
			 Cookie c2=new Cookie("name",URLEncoder.encode("你好","utf-8"));
			 //添加Cookie
			 response.addCookie(c1);
			 response.addCookie(c2);
		%>
		
		<!-- 使用request来获取Cookie对象中的数据 -->
		<%
		    Cookie[] cs=request.getCookies();
			for(int i=0;i<cs.length;i++){
				Cookie c=cs[i];
				out.println(c.getName()+","+URLDecoder.decode(c.getValue(),"utf-8")+"<br/>");
			}
		%>
		
    </body>
</html>