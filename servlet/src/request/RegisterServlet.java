package request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�����ע���ύ��Servlet
public class RegisterServlet extends HttpServlet{

	//����service����
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ����ʽ
		//System.out.println("����ʽ="+request.getMethod());
		//System.out.println("ע��...");
		//http://localhost:8080/servlet/register?username=bbb&pwd=123&smt=%CC%E1%BD%BB
		//���ձ��ύ���͹����Ĳ���
		//1������һ��name���һ����Ӧ��valueֵ�����
		String strName=request.getParameter("username");
		String strPwd=request.getParameter("pwd");
		System.out.println(strName+" "+strPwd); //bbb 123
		//http://localhost:8080/servlet/register?username=aaaaa&pwd=111
		//&love=lanqiu&love=readbook&love=football&smt=%CC%E1%BD%BB
		//String strLove=request.getParameter("love");
		//System.out.println(strLove); //ֻ�ܻ�ȡ��һ��love��Ӧ��valueֵ
		//2������һ��name��ö����Ӧ��valueֵ�����
		String[] loves=request.getParameterValues("love");
		System.out.println(Arrays.toString(loves));//[lanqiu, readbook, football]
		//3����ȡ������������е�nameֵ���
		Enumeration<String> names=request.getParameterNames();
		System.out.println(names);//java.util.Collections$1@898587
		//ʹ��ѭ����names�е�����ȡ��
		//names.hasMoreElements()���ز������͵Ľ��   ����������������ݽ������true
		//����������е������Ѿ�ȡ��û�������˽������false
		//name�������������ݣ�[username,pwd,love,smt]
		//nextElement()����ȥ�����е�����
		while(names.hasMoreElements()){
			System.out.println(names.nextElement()); 
		}
		/*
		   username
           pwd
           love
           smt
		 */
		
		
		
	}
	
}
