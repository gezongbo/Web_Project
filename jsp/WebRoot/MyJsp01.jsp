<%@page   pageEncoding="utf-8"   import="java.util.Date,java.util.Random"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'MyJsp01.jsp' starting page</title>
    <style>
          div{
             color:red;
          }
    </style>
  </head>
  
  <body>
      <div>HelloJSP</div>
      <br/>
      <a href="http://www.baidu.com">to baidu</a>
      
      <!-- jsp中写java代码：jsp的表达式写法 -->
      <br/>
      <!-- 常量值 -->
      <%=100   %>
      <%=3.14  %>
      <!-- 配合运算符写表达式 -->
      <%=100+100 %>
      <%=3>1 %>
      <!-- 有返回值的方法 -->
               圆周率为：<%=Math.PI %>
      <br/>
      <div style="font-size:50px">
                          两个数100和200，其中最大值为：<%=Math.max(100,200)    %>
      </div>
      
      <!-- jsp中写java代码：jsp的脚本片段写法 -->          
      <%
          int a=2;
          int b;
          b=5;
          //向控制台输出结果
          System.out.println(a+b);
          //向页面输出结果   out是JSP页面的隐含对象
          out.println(a+b);
          for(int i=1;i<=10;i++){
        	  //out.write(i+"");
        	  out.println(i);
          }
      %>
   
   	  <br/>
      <!-- 调用变量来使用:输出变量a和b的值 -->
      <!-- jsp的表达式写法 -->
      a=<%=a  %>
      b=<%=b  %>
      <br/>
      <!-- jsp的脚本片段写法 -->
      a=<%   out.println(a);   %>
      b=<%   out.println(b);   %>
   
      <br/>
      <!-- 在页面中显示10个去百度的超链接 -->
      <a href="http://www.baidu.com">去百度</a><br/>
      <%
          for(int i=1;i<=10;i++){
      %>
        	  <a href="http://www.baidu.com">去百度</a><br/>
        	  <div>hello</div>
      <%
          }
      %>
   
   
       <%
       		String s="aaa";
            StringBuffer sbuf=new StringBuffer();
            Date date=new Date();
            //将时间输出在网页上
            out.println(date);
       %>
       <br/>
                 产生1-100之间的随机数：
       <%
            Random r=new Random();
            int num=r.nextInt(100)+1;
            out.println(num);
       %> 
       
       <hr/>
       <!-- 使用include指令 -->
       <%@include file="index.jsp" %>
       <hr/>
       <%@include file="MyHtml.html" %>
       
       <hr/>
       <!-- html注释 -->
       <!-- 
       <%
          int age=30;
       %>
       -->
                    我的年龄为:<%=age %>    <% out.println(age); %>
       
       <hr/>
       <%-- jsp注释 --%>
       <%-- 
       <%
          int age1=20;
       %>
       --%>
       <%-- 
                我的年龄为:<%=age1 %>   <% out.println(age1); %>
        --%>
  </body>
</html>
