package com.mycompany.web.contextlistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized run...");
		ServletContext application = sce.getServletContext();
		String contextConfigLocation = application.getInitParameter("contextConfigLocation");
		
		System.out.println(contextConfigLocation + "을 읽고 Spring WebApplicationContext를 구성합니다.");
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed run...");
	}
	
}
