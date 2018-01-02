package ua.khpi.golik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainFormServlet")
public class MainFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello From GET method " + userName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello From POST method " + userName + 
		"We know your full name is " + fullName);
		out.println();
		String prof = request.getParameter("prof");
		out.println("You are a " + prof);
		out.println();
		String[] location = request.getParameterValues("location");
		out.println("You are from " + location.length + " places : ");
		for(int i = 0; i < location.length; i++) {
			out.println(location[i]);
		}
	}

}
