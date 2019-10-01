package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet4 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HOW1 응답생성 
		/*response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h4>DispatcherServlet4</h4>");
		out.println("		응답 내용");
		out.println("	</body>");
		out.println("</html>");		*/
				
		//HOW2 응답생성 
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher4.jsp");
		rd.forward(request, response);
	}
	
}
