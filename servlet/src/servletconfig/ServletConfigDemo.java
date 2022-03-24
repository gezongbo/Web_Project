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
//��ʾServletConfig�����ʹ��
public class ServletConfigDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��web.xml�ļ��е�<servlet>��ǩ��������һЩ��ʼ������
		//ʹ��ServletConfig��������ȡ��Щ��ʼ������
		
		//���ServletConfig����
		ServletConfig scf=this.getServletConfig();
		
		//�÷���ͨ�����õ�<param-name>��ֵ��ȡ<param-value>��ֵ
		/*
		String strPwd=scf.getInitParameter("pwd");
		String strUrl=scf.getInitParameter("url");
		String strId=scf.getInitParameter("id");
		System.out.println(strPwd+" "+strUrl+" "+strId);
		*/
		
		//��ȡ��ʼ�����������е�<param-name>��ֵ
		Enumeration<String> params=scf.getInitParameterNames();
		//ʹ��ѭ����params�����е�ֵȡ��
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
		
		
		//�ڻ�ȡServletContext����
		ServletContext sct=scf.getServletContext();
		
		
		
		
		
	}

}







