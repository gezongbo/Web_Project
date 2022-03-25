# 1、JSP介绍
 

>  JSP是由SUN公司提供动态web资源的开发技术，看起来非常的像HTML，但是JSP可以在里面写java代码，而HTML是不可以的。所以JSP是一种动态网页开发技术。

> JSP的出现是为了解决Servlet在响应到页面端时不适合往外输出的问题。 HTML适合用来开发页面，展示数据，但是HTML开发出来的页面本质上就是一个文档，无法展示动态的数据。  

> JSP非常适合编写HTML代码，合适作为响应页面向外输出，同时JSP里面可以写Java代码，可以展示动态数据。   

> Java Server Page  Java服务器端的一种页面技术

# 2、编写JSP以及JSP的文档结构
##   1）写一个以.jsp为后缀的文件
## 2）在该文件中，可以包含如下内容：
   
 - HTML  CSS   JavaScript
 - Java代码
 - 注释
 - 指令
 - 隐含对象
# 3、JSP页面中的Java代码
   **Java代码可以写在jsp文件中的任意位置
   两种方式：**
## （1）jsp表达式写法
语法:  
 

```java
 <%=………   %>
```
 内容：变量、变量加运算符组合的表达式、常量值、有返回值的方法
      功能：将内容输出到页面上显示， =是输出的功能
## （2）jsp脚本片段写法（代码块写法）
  语法:  
```java
  	<% 
              ……
              ……
	%>
```
  内容：java代码的片段
  功能：通过java代码的片完成一段业务逻辑的功能
# 4、指令：jsp声明写法（jsp的声明一般写在jsp页面的开头）
   

```java
	语法: <%@指令名  属性1=值1   属性2=值2 ...  %>
```

##  (1) page指令
```java
	pageEncoding=”utf-8”   设置jsp文件保存时的中文编码
	import=””      在jsp页面章导包使用
```
## （2）include指令
   

```java
  	语法:   <%@include   file=”引入的文件.jsp”     %>
  	功能：能够将其它文件包含进来，可以包含jsp文件，也可以包含html文件
```

## （3）taglib指令
  

```java
  	语法：<%@taglib   uri=””   prefix=””  %>
  	功能：用来引入标签库   （ el表达式、jstl标准标签库）
```

# 5、注释

```java
（1）<!--   注释内容    -->
       Html注释，注释中的内容如果包含了java代码，java代码注释不了，这些java代码会被执行的。
（2）<%--   注释内容   --%>
       Jsp注释，如果注释的内容包含了java代码，会被注释掉
```

```java
<%@page   pageEncoding="utf-8"  import="java.util.Date,java.util.Random"  %>
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
       
   
   
  </body>
</html>

```
