<%@page pageEncoding="utf-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<html>
    <head>
         <title>el表达式的功能2：获得请求参数</title>
    </head>
  
    <body>
		<!-- 访问el02.jsp的地址是：
		     http://localhost:8080/jsp/el02.jsp?id=1001&a=1&love=rd&love=online&
		     love=football
		 -->
		 <!-- 通过java代码的方式获取来获取id的值-->
		 <%=request.getParameter("id") %>
		 <%
		    String strId=request.getParameter("id");
		 	out.println(strId);
		 %>
		 <!-- 使用el表达式的方式来获取id的值 -->
		 ${param.id} 
		 ${param.a}
		 ${param.love}  <!-- 结果是rd，是love的第一个值 -->
		 
		 <hr/>
		 <!-- 使用java代码的方式来获取一个key对应多个value值的情况 -->
		 <%
		 	//获取参数中所有的name值/key值
		 	Enumeration<String> keys=request.getParameterNames();
		 	while(keys.hasMoreElements()){
		 		out.println(keys.nextElement());
		 	}
		 	out.println("<br/>");
		 	//根据key值获取多个对应value值的情况
		 	String[] loves=request.getParameterValues("love");
		 	out.println(loves);//[Ljava.lang.String;@10463c3
		 	out.println(Arrays.toString(loves));  // [rd, online, football]
		    for(int i=0;i<loves.length;i++){
		    	out.println(loves[i]);   //rd online football
		    }
		 	//增强版for循环   
		 	//冒号右边：要循环的数组        冒号左边：每次循环的值
		 	for(String s:loves){
		 		out.println(s);  //rd online football
		 	}
		 %>
		 
		 <hr/>
		 <!-- 使用el表达式的方式来获取一个key对应多个value值的情况 -->
		 ${paramValues.love}  <!-- [Ljava.lang.String;@1feb2ea -->
		 ${paramValues.love[0] }  <!-- rd -->
		 ${paramValues.love[1] }  <!-- online -->
		 ${paramValues.love[2] }  <!-- football -->
    </body>
</html>




