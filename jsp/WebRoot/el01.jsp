<%@page pageEncoding="utf-8"%>
<html>
    <head>
         <title>el表达式功能1：输出简单的运算结果</title>
    </head>
    <body>
		<!-- 1）算术运算 -->
		<!-- el表达式写法 -->
		${1+1}
		${3.14}
		${3*5}
		<br/>
		<!-- java代码表达式的写法 -->
		<%=1+1 %>
		<%=3.14 %>
		<%=3*5 %>
		<br/>
		<!-- java代码块写法 -->
		<%  out.println(1+1);  %>
		<%  out.println(3.14); %>
		<%  out.println(3*5);  %>
		
		<br/>
		<!-- 2) 关系运算和逻辑运算 -->
		${3>2}
		<%=3>2 %>
		${3>2 && 1<5}
		${!(3>2)}
		<br/>
		<%
			int a=10;
			int b=20;
			String str="abc";
			String str1=null;
			//在java代码块中定义的变量直接用el表达式获取不到，可以将变量放入域对象中，el表达式是可以从域对象中获取值的
			//pageContext request session application
			pageContext.setAttribute("p1",a);
			pageContext.setAttribute("p2",b);
			pageContext.setAttribute("p3",str);
			pageContext.setAttribute("p4",str1);
		%>
		<!-- java代码的方式获取变量的值 -->
		<%=a %>
		<%=b %>
		<%=str %>
		<!-- el表达式的写法 -->
		${a}  ${b}  ${str}
		<!-- 上面el表达式获取在java代码块中定义的变量的值是获取不到的 -->
		<!-- 使用el表达式可以直接从域对象中pageContext取值 -->
		${p1}  ${p2}  ${p3}  
		<hr/>
		<!-- el表达式进行比较和逻辑运算 -->
		${p1>p2}     <!-- false -->
		${p1==10}    <!-- true -->
		${p3=="abc"}   <!-- true -->
		${p3!="abc"}   <!-- false -->
		${p1==10 && p3!="abc"}  <!-- false -->
		<!-- 等价写法：java代码的写法 -->
		<%=a==10 &&  str!="abc"%>  <!-- false -->
		
		<hr/>
		<!-- 3、empty运算 -->
		str的值：${p3 }
		str1的值：${p4 }
		<!-- 使用empty判断是否为空 -->
		<br/>
		${empty p3}  <!-- false -->
		${empty p4} <!-- true -->
		
		
    </body>
</html>



