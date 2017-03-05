package edu.fatec;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/soma")
public class Soma implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String n1 = request.getParameter("NUM1");
		String n2 = request.getParameter("NUM2");
		
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		
		int soma = a + b;
		
		response.getWriter().printf("A soma desses negos é "+soma);
		response.getWriter().flush();
		
		System.out.println("A soma desses negos é "+soma);
	}

}
