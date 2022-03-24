<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>pageContext隐式对象、四大域对象</title>
    </head>
  
    <body>
		<%
            //从pageContext中获取数据
            out.println("a="+pageContext.getAttribute("a"));
		    //从request、session和application中依次取出数据
		    out.println("b="+request.getAttribute("b"));
		    out.println("c="+session.getAttribute("c"));
		    out.println("d="+application.getAttribute("d"));
		%>

		<!-- 测试
		     1、只访问MyJsp09.jsp        
		        a=1   b=2   c=3   d=4
		     2、先访问MyJsp09.jsp，在访问MyJsp10.jsp   --没有转发的情况
		       a=null b=null c=3 d=4
		     3、转发，访问MyJsp09.jsp,由MyJsp09.jsp转发到MyJsp10.jsp    --由转发的情况
		       a=null b=2 c=3 d=4
		     4、不转发，先访问MyJsp09.jsp，在访问MyJsp10.jsp
		        a=null b=null c=3 d=4
		                    然后关闭浏览器（结束会话），重新打开浏览器访问MyJsp10.jsp
		        a=null b=null c=null d=4    
		     5、不转发，先访问MyJsp09.jsp，在访问MyJsp10.jsp
		        a=null b=null c=3 d=4     
		                   然后重新打开一个新的浏览器（别人）直接访问MyJsp10.jsp  
		       a=null b=null c=null d=4   
		 -->




    </body>
</html>