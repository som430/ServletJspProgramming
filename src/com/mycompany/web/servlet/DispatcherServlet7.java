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
import javax.servlet.http.HttpSession;

import com.mycompany.web.dto.Counter;

public class DispatcherServlet7 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//application 범위에 객체를 저장
		ServletContext sc = request.getServletContext();
		if(sc.getAttribute("applicationCounter") == null) {
			Counter applicationCounter = new Counter();
			sc.setAttribute("applicationCounter", applicationCounter);	
		}
		
		//session 범위에 객체를 저장
		HttpSession session = request.getSession();
		if(session.getAttribute("sessionCounter") == null) {
			Counter sessionCounter = new Counter();
			session.setAttribute("sessionCounter", sessionCounter);
		}
		
		//request 범위에 객체를 저장
		if(request.getAttribute("requestCounter")==null) {
			Counter requestCounter = new Counter();
			request.setAttribute("requestCounter", requestCounter);	
		}
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher8"); ///dispatcher8이 응답...
		rd.forward(request, response);
		
	}
}
