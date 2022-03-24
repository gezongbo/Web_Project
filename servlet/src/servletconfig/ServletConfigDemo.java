package servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示ServletConfig对象的使用
public class ServletConfigDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//在web.xml文件中的<servlet>标签中配置了一些初始化参数
		//使用ServletConfig对象来获取这些初始化参数
		
		//获得ServletConfig对象
		ServletConfig scf=this.getServletConfig();
		
		//该方法通过配置的<param-name>的值获取<param-value>的值
		/*
		String strPwd=scf.getInitParameter("pwd");
		String strUrl=scf.getInitParameter("url");
		String strId=scf.getInitParameter("id");
		System.out.println(strPwd+" "+strUrl+" "+strId);
		*/
		
		//获取初始化参数中所有的<param-name>的值
		Enumeration<String> params=scf.getInitParameterNames();
		//使用循环将params中所有的值取出
		while(params.hasMoreElements()){
			//System.out.println(params.nextElement());
			String name=params.nextElement();
			String value=scf.getInitParameter(name);
			System.out.println(name+","+value);
		}
		/*
		 * 
		 * id,1001
           pwd,123456
           url,www.baidu.com

		 * 
		 */
		
		
		//②获取ServletContext对象
		ServletContext sct=scf.getServletContext();
		
		
		
		
		
	}

}







