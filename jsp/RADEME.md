# 1��JSP����
 

>  JSP����SUN��˾�ṩ��̬web��Դ�Ŀ����������������ǳ�����HTML������JSP����������дjava���룬��HTML�ǲ����Եġ�����JSP��һ�ֶ�̬��ҳ����������

> JSP�ĳ�����Ϊ�˽��Servlet����Ӧ��ҳ���ʱ���ʺ�������������⡣ HTML�ʺ���������ҳ�棬չʾ���ݣ�����HTML����������ҳ�汾���Ͼ���һ���ĵ����޷�չʾ��̬�����ݡ�  

> JSP�ǳ��ʺϱ�дHTML���룬������Ϊ��Ӧҳ�����������ͬʱJSP�������дJava���룬����չʾ��̬���ݡ�   

> Java Server Page  Java�������˵�һ��ҳ�漼��

# 2����дJSP�Լ�JSP���ĵ��ṹ
##   1��дһ����.jspΪ��׺���ļ�
## 2���ڸ��ļ��У����԰����������ݣ�
   
 - HTML  CSS   JavaScript
 - Java����
 - ע��
 - ָ��
 - ��������
# 3��JSPҳ���е�Java����
   **Java�������д��jsp�ļ��е�����λ��
   ���ַ�ʽ��**
## ��1��jsp���ʽд��
�﷨:  
 

```java
 <%=������   %>
```
 ���ݣ��������������������ϵı��ʽ������ֵ���з���ֵ�ķ���
      ���ܣ������������ҳ������ʾ�� =������Ĺ���
## ��2��jsp�ű�Ƭ��д���������д����
  �﷨:  
```java
  	<% 
              ����
              ����
	%>
```
  ���ݣ�java�����Ƭ��
  ���ܣ�ͨ��java�����Ƭ���һ��ҵ���߼��Ĺ���
# 4��ָ�jsp����д����jsp������һ��д��jspҳ��Ŀ�ͷ��
   

```java
	�﷨: <%@ָ����  ����1=ֵ1   ����2=ֵ2 ...  %>
```

##  (1) pageָ��
```java
	pageEncoding=��utf-8��   ����jsp�ļ�����ʱ�����ı���
	import=����      ��jspҳ���µ���ʹ��
```
## ��2��includeָ��
   

```java
  	�﷨:   <%@include   file=��������ļ�.jsp��     %>
  	���ܣ��ܹ��������ļ��������������԰���jsp�ļ���Ҳ���԰���html�ļ�
```

## ��3��taglibָ��
  

```java
  	�﷨��<%@taglib   uri=����   prefix=����  %>
  	���ܣ����������ǩ��   �� el���ʽ��jstl��׼��ǩ�⣩
```

# 5��ע��

```java
��1��<!--   ע������    -->
       Htmlע�ͣ�ע���е��������������java���룬java����ע�Ͳ��ˣ���Щjava����ᱻִ�еġ�
��2��<%--   ע������   --%>
       Jspע�ͣ����ע�͵����ݰ�����java���룬�ᱻע�͵�
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
      
      <!-- jsp��дjava���룺jsp�ı��ʽд�� -->
      <br/>
      <!-- ����ֵ -->
      <%=100   %>
      <%=3.14  %>
      <!-- ��������д���ʽ -->
      <%=100+100 %>
      <%=3>1 %>
      <!-- �з���ֵ�ķ��� -->
               Բ����Ϊ��<%=Math.PI %>
      <br/>
      <div style="font-size:50px">
                          ������100��200���������ֵΪ��<%=Math.max(100,200)    %>
      </div>
      
      <!-- jsp��дjava���룺jsp�Ľű�Ƭ��д�� -->          
      <%
          int a=2;
          int b;
          b=5;
          //�����̨������
          System.out.println(a+b);
          //��ҳ��������   out��JSPҳ�����������
          out.println(a+b);
          for(int i=1;i<=10;i++){
        	  //out.write(i+"");
        	  out.println(i);
          }
      %>
   
   	  <br/>
      <!-- ���ñ�����ʹ��:�������a��b��ֵ -->
      <!-- jsp�ı��ʽд�� -->
      a=<%=a  %>
      b=<%=b  %>
      <br/>
      <!-- jsp�Ľű�Ƭ��д�� -->
      a=<%   out.println(a);   %>
      b=<%   out.println(b);   %>
   
      <br/>
      <!-- ��ҳ������ʾ10��ȥ�ٶȵĳ����� -->
      <a href="http://www.baidu.com">ȥ�ٶ�</a><br/>
      <%
          for(int i=1;i<=10;i++){
      %>
        	  <a href="http://www.baidu.com">ȥ�ٶ�</a><br/>
        	  <div>hello</div>
      <%
          }
      %>
   
   
       <%
       		String s="aaa";
            StringBuffer sbuf=new StringBuffer();
            Date date=new Date();
            //��ʱ���������ҳ��
            out.println(date);
       %>
       <br/>
                 ����1-100֮����������
       <%
            Random r=new Random();
            int num=r.nextInt(100)+1;
            out.println(num);
       %> 
       
   
   
  </body>
</html>

```
