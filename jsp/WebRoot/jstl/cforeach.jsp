<%@page pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lddx.bean.Student"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:foreach标签的语法</title>
    </head>
  
    <body>
		<!-- 循环输出1-10 -->
		<!-- java代码的方式 -->
		<%
			for(int i=1;i<=10;i=i+1){
				out.println(i);
			}
		%>
		<br/>
		<!-- jstl的方式 
			 begin="" 循环的开始
			 end="" 循环的结束
			 step=""  循环的步进情况  1=i++/i=i+1   2 = i=i+2
			 var="" 指定循环的变量
		-->
		<c:forEach begin="1" end="10" step="1" var="i">
			${i}
		</c:forEach>
		
		<hr/>
		<!-- 使用c:foreach标签对集合的数据进行迭代操作 -->
		<%
			ArrayList<String> list=new ArrayList<String>();
			list.add("a");
			list.add("b");
			list.add("c");
			list.add(0,"d");
			out.println(list);  //[d, a, b, c]
			                //下标     0  1  2  3
			out.println("<br/>");
			for(int i=0;i<list.size();i++){  //i=0 1 2 3
				out.println(list.get(i));
			} 
			//将list集合放入域对象中存储
			pageContext.setAttribute("list",list);
		%>
		<!-- c:foreach标签对list集合进行迭代
			 items="" 要循环迭代的哪个集合，使用el表达式获取
			 var="" 每一次循环从集合中取出的内容赋值给var定义的值
			 varStatus="" 循环的状态
			           xx.index每一次循环取数据对应的下标，从0开始
			           xx.count表示执行的第几次循环状态，从1开始
		 -->
		 <br/>
		<c:forEach items="${list}" var="str" varStatus="status">
			str:${str}
			index:${status.index}
			count:${status.count}
			<br/>
		</c:forEach>
		
		<hr/>
		<!-- c:foreach标签对集合存储的JavaBean对象的操作 -->
		<%
			Student stu1=new Student();
			stu1.setId(1001);
			stu1.setName("张三");
			stu1.setAge(20);
			pageContext.setAttribute("stu1",stu1);
			Student stu2=new Student(1002,"李四",25);
			pageContext.setAttribute("stu2",stu2);
			Student stu3=new Student(1003,"王五",22);
			Student stu4=new Student(1004,"赵六",30);
			//将stu1 stu2 stu3和stu4放入ArrayList集合中
			ArrayList<Student> stus=new ArrayList<Student>();
			stus.add(stu1);
			stus.add(stu2);
			stus.add(stu3);
			stus.add(stu4);
			out.println(stus);
			pageContext.setAttribute("stus",stus);
		%>
		<br/>
		<!-- 使用el表达式获取JavaBean对象中的属性 -->
		学生1的相关信息：${stu1.id}  ${stu1.name}  ${stu1.age}
		<br/>
		学生2的相关信息：${stu2.id}  ${stu2.name}  ${stu2.age}
		<hr/>
		<!-- 不用单独的将每个学生的信息获取，可以使用c:foreach循环将stus集合中的数据依次取出 -->
		<c:forEach items="${stus}" var="stu">
			<!-- stu表示每一次循环取出的对应的学生对象 -->
			${stu}  每个学生的信息具体为：${stu.id} ${stu.name} ${stu.age}
			<br/>
		</c:forEach>
		
    </body>
</html>










