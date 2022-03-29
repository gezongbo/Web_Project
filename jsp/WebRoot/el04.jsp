<%@page pageEncoding="utf-8"%>
<%@page import="com.lddx.bean.Student"%>
<html>
    <head>
         <title>el表达式的功能4：获取javabean中的属性值</title>
    </head>
  
    <body>
		<%
			Student stu1=new Student();
			stu1.setId(1001);
			stu1.setName("张三");
			stu1.setAge(30);
			Student stu2=new Student(1002,"李四",20);
			//将stu1和stu2放入域对象中存储
			session.setAttribute("stu1",stu1);
			session.setAttribute("stu2",stu2);
		%>
		<!-- 使用el表达式来获取域对象中javabean类中的属性值 -->
		stu1的信息：${stu1.id}   ${stu1.name }   ${stu1.age}
		          ${stu1}
        <hr/>
        stu2的信息：${stu2}   ${stu2.id}  ${stu2.name}

    </body>
</html>