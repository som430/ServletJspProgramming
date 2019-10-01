package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//(웹 브라우저가 서버로 넘긴)요청 parameter 받기 
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		int intAge = Integer.parseInt(age);
		
		request.setAttribute("name", name);
		request.setAttribute("age", intAge);
		
		/*ServletContext servletContext = request.getServletContext();
		servletContext.setAttribute("name", name);
		servletContext.setAttribute("age", age);*/
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		rd.forward(request, response);
	}
	
}
