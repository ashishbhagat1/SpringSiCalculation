package com.ashu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IntrestCalculatorServlet
 */
public class IntrestCalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String s1=request.getParameter("time");
		String s2=request.getParameter("amount");
		
		IntrestBean ib = new IntrestBean();
		ib.setTime(Integer.parseInt(s1));
		ib.setAmount(Integer.parseInt(s2));
		ib.process();
		
		request.getSession().setAttribute("dataS", ib);
		response.sendRedirect("result.jsp");
		
	}

}
