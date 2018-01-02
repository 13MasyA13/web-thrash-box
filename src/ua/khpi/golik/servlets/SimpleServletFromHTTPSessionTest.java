package ua.khpi.golik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/SimpleServletFromHTTPSessionTest"}, 
initParams = { @WebInitParam(name = "defaultUser", value = "User_Name")})
public class SimpleServletFromHTTPSessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		String userName = request.getParameter("userName");
		if(userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
		out.println("Hello from DOGET PARAMETERS " + userName);
		out.println("Hello from SESSION PARAMETERS" + (String) session.getAttribute("savedUserName"));
		out.println("Hello from SERVLETS CONTEXT PARAMETERS" + (String) context.getAttribute("savedUserName"));
		out.println("Hello " + this.getServletConfig().getInitParameter("defaultUser"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
