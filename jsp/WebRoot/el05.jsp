<%@page pageEncoding="utf-8"%>
<%@page import="com.lddx.bean.Student"%>
<html>
    <head>
         <title></title>
    </head>
  
    <body>
		<!-- 使用el表示获取TestServlet转发过来的数据，这些数据是放在request域对象中的，el表达式可以从域对象取值 -->
		${a}   ${requestScope.a}    ${stu}  ${requestScope.stu}  ${stu.id}
		<hr/>
		<!-- 使用java代码的方式 -->
		a的值为:<%=request.getAttribute("a") %>
		学生对象的内容：
		<%
			Student stu=(Student)request.getAttribute("stu");
			out.println(stu);
			out.println("<br/>");
			out.println(stu.getId()+","+stu.getName());
		%>
    </body>
</html>