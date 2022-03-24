<%@page language="java"  import="java.util.*"  pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>演示JSP中的九大隐式对象</title>
  </head>
  
  <body>
    <!-- request隐式对象 -->
    <!-- 1、获取请求参数 -->
          参数id的值为: <%=request.getParameter("id")    %>
         参数name的值为:<%  
                    String strName=request.getParameter("name");
                    out.println(strName);
               %>
   
   <!-- 2、作为域对象来存取值 -->
   <%
       request.setAttribute("age",100);    
   	   //在当前JSP页面中从request域对象中取值（上下的代码是属于一次请求下来的）
       Integer itgAge=(Integer)request.getAttribute("age");
   	   out.println(itgAge);
   	   //转发，转到到另外一个jsp页面（请求从一个jsp页面开始，到转到的另外一个jsp页面结束）
   	   RequestDispatcher rd=request.getRequestDispatcher("MyJsp03.jsp");
   	   rd.forward(request,response);
   %>
   
    
  </body>
</html>
