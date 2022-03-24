<%@page pageEncoding="utf-8"%>
<%@page import="java.util.Enumeration"%>
<html>
    <head>
         <title>application隐式对象</title>
    </head>
  
    <body>
		<!-- 使用application获取web.xml文件中配置的全局参数 -->
		<%
		    String strA=application.getInitParameter("a");
		    String strB=application.getInitParameter("b");
			//out.println(strA);
		    //out.println(strB);
		    
		    Enumeration<String> enus=application.getInitParameterNames();
		    while(enus.hasMoreElements()){
		    	String name=enus.nextElement();
		    	String value=application.getInitParameter(name);
		    	out.println(name+","+value+"<br/>");
		    }
		%>
		
		<!-- 使用application域对象存数据 -->
		<%
			application.setAttribute("name","李四");
		%>
		
		
		
    </body>
</html>