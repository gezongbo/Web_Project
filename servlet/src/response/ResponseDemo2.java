package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ʹ��setHeader���ö�ʱˢ�£�ʵ�ֶ���ʱ��������ת
public class ResponseDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������Ӧ���ı��ͱ���
		response.setContentType("text/html;charset=utf-8");
		
		//����ַ������
		PrintWriter pw=response.getWriter();
		pw.write("5������ٶ�");
		
		//���ö�ʱˢ��   --����ʱ��������ת
		//response.setHeader("Refresh","5;url=http://www.baidu.com");
		//�������ʱ�������ˢ��
		response.setHeader("Refresh", "5");
		
	}

}
