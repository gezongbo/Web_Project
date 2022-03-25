# EMS-员工信息管理系统(Servlet)
[MySQL--基础操作](https://blog.csdn.net/gezongbo/article/details/120690560)
[MySQL--基础命令实操](https://blog.csdn.net/gezongbo/article/details/120691435)
## 创建ems库 

```sql
	show databases;
	create database ems;
	use ems;
```

## 创建user表
  

```sql
      create table user(
            id int primary key auto_increment,
            name varchar(50),
            salary double,
            age int
);
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/2ea64565127f4b06a5caa69daa2eef7f.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_11,color_FFFFFF,t_70,g_se,x_16#pic_center)

## 插入表格数据
```sql
   insert into user values(1,'zs',3000,20);
   insert into user values(2,'ls',1000,30);
   insert into user values(3,'ww',5000,25);
   insert into user values(4,'xh',4000,23);
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/ccfec314a4b04b4f9956b7ef8e2e7bf5.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_16,color_FFFFFF,t_70,g_se,x_16#pic_center)

# 创建UserListServlets
![在这里插入图片描述](https://img-blog.csdnimg.cn/d58f9f4cf5ad44e8b942033b157c3566.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
![在这里插入图片描述](https://img-blog.csdnimg.cn/ef30c567bd594ac48abf2970e49a1c28.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
![在这里插入图片描述](https://img-blog.csdnimg.cn/42b71d9df79b46af996b5612dff25ae7.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
# 使用JDBC连接数据库
将jar包复制的到lib文件夹下
![在这里插入图片描述](https://img-blog.csdnimg.cn/9fc2954d75b04bc9a2718f37f6b7e7a0.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_17,color_FFFFFF,t_70,g_se,x_16#pic_center)

```java
		//使用JDBC连接mysql数据库，将user表中的输出查询处理
		ResultSet result=null;
		Connection con=null;
		try {
			//(1)注册加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//(2)获得数据库的链接
			//(1).连接mysql的url地址
			String url="jdbc:mysql://localhost:3306/ems";
			//(2).连接mysql的用户名
			String username="root";
			//(3).连接mysql的密码
			String pwd="123456";
			con=DriverManager.getConnection(url, username, pwd);
			//(3)预编译sql语句
			System.out.println("MySQL连接成功！"+con);
			
			//3.预编译SQL语句
			String sql="select * from user";
			PreparedStatement prep=con.prepareStatement(sql);
			//(4)执行sql语句
			result=prep.executeQuery();
			//(5)关闭
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
```

```java
package EMS;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//员工信息查询的Servlet
public class UserListServlets extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//使用JDBC连接mysql数据库，将user表中的输出查询处理
		ResultSet result=null;
		Connection con=null;
		try {
			//(1)注册加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//(2)获得数据库的链接
			//(1).连接mysql的url地址
			String url="jdbc:mysql://localhost:3306/ems";
			//(2).连接mysql的用户名
			String username="root";
			//(3).连接mysql的密码
			String pwd="123456";
			con=DriverManager.getConnection(url, username, pwd);
			//(3)预编译sql语句
			System.out.println("MySQL连接成功！"+con);
			
			//3.预编译SQL语句
			String sql="select * from user";
			PreparedStatement prep=con.prepareStatement(sql);
			//(4)执行sql语句
			result=prep.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//使用response,获得字符输出流PrintWriter,将查询出的结果输出到浏览器端
		//设置格式编码
		response.setContentType("text/html;charset=utf-8");
		
		//向浏览器端输出一个表格
		PrintWriter pw=response.getWriter();
		pw.println("<table border='1' cellspacing='0' width='400' height='80' align='center'>");
		pw.println("<caption>员工信息表</caption>");
		pw.println("<tr align='center'>");
		pw.println("<td>工号</td><td>姓名</td><td>工资</td><td>年龄</td>");
		pw.println("</tr>");
		try {
			while(result.next())
			{
				pw.println("<tr align='center'><td>"+result.getInt("id")+"</td><td>"
				+result.getString("name")+"</td><td>"+result.getDouble("salary")+"</td><td>"
				+result.getInt("age")+"</td></tr>");
				System.out.println(result.getInt("id")+"---"+result.getString("name")+"---"+
						result.getDouble("salary")+"---"+result.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		pw.println("</table>");
		//关闭
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

```
# 最后，部署服务器
[重新部署服务器参考](https://blog.csdn.net/gezongbo/article/details/123517601?spm=1001.2014.3001.5501)
访问网址：[http://localhost:8080/Servlet/lists](http://localhost:8080/Servlet/lists)
![在这里插入图片描述](https://img-blog.csdnimg.cn/1a370119b0a047588c4896f6e74ad73a.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAQm9CbyB5ZWFo,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
