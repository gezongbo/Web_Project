<%@page pageEncoding="utf-8"  isErrorPage="true" %>
<html>
    <head>
         <title>exception隐含对象</title>
    </head>
  
    <body>
		<!-- 显示异常信息的页面 -->
		异常信息为：<%=exception.getMessage() %>
    </body>
</html>