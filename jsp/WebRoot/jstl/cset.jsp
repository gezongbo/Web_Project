<%@page pageEncoding="utf-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.lddx.bean.Student"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
         <title>c:set标签库的的使用语法</title>
    </head>
  
    <body>
		<h3>向域对象中增加属性</h3>
		<%
			//通过java代码的方式向域对象pageContext存储数据
		   	pageContext.setAttribute("name","张三");
		%>
		${name}
		<c:out value="${name}"></c:out>
		<!-- 使用c:set标签向域对象中增加属性
		     scope=""属性：指定向哪个域对象中存数据
		     var=""属性：域对象中存储的数据的key
		     value=""属性：域对象中存储的数据的value
		     jsp四大域对象/隐式对象  pageContext request         session            application
		     c:set scope=""    page       request         session           application
		     el表达式中xxScope   pageScope  requestScope    sessionScope    applicationScope
		     servlet类中                     无	  HttpServletRequest  HttpSession      ServletContext 
		 -->
		<c:set var="name1" value="李四" scope="page"></c:set>
		<c:set var="name1" value="王五" scope="session"></c:set>
		<c:set var="name1" value="赵六" scope="request"></c:set>
		<c:set var="name1" value="小红" scope="application"></c:set>
		<br/>
		<!-- 使用el表达式的方式取 -->
		a:${name1}  b:${pageScope.name1}  c:${sessionScope.name1}  xx:${requestScope.name1}
		yy:${applicationScope.name1}
		<br/>
		<!-- 使用java代码的方式取 -->
		d:<%=pageContext.getAttribute("name1") %>
		e:<%=session.getAttribute("name1") %>
		
		<h3>向Map集合中增加修改数据</h3>
		<%
			Map<String,String> map=new HashMap<String,String>();
			map.put("n1","张三");
			map.put("n2","李四");
			//将存储数据的集合map放入域对象中
			request.setAttribute("map",map);
		%>
		<!-- 使用el表达式 -->
		${map}  ${requestScope.map}
		<!-- java代码的方式取 -->
		<%=request.getAttribute("map") %>
		<!-- 使用c:set标签修改map集合中的数据
			 target=""属性：要修改的集合，通过el表达式来获取得到的
			 property=""属性：要修改的MAP集合中的key值
			 value=""属性：要修改的MAP集合中的value值
		 -->
		<c:set target="${map}" property="n2" value="小李四"></c:set>
		<br/>
		${map}
		<br/>
		<!-- 使用c:set标签往map集合中增加数据 -->
		<c:set target="${map}" property="n3" value="王五"></c:set>
		${map}
		
		<h3>修改JavaBean的属性</h3>
		<%
			Student stu=new Student();
			stu.setId(1001);
			stu.setName("张三");
			stu.setAge(20);
			//将创建的stu放入域对象中，只有放入域对象中，el表达式才可以从域对象中获取到stu
			request.setAttribute("stu",stu);
		%>
		<!-- 使用el表达式来获取JavaBean中的属性 -->
		${stu} ${stu.id}  ${stu.name}  ${stu.age}
		<!-- c:set标签需改javabean中的属性值 -->
		<c:set target="${stu}" property="name" value="小张三"></c:set>
		<c:set target="${stu}" property="age" value="30"></c:set>
		<br/>
		${stu}
		
    </body>
</html>



