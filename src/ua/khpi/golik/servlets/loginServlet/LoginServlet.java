package ua.khpi.golik.servlets.loginServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.khpi.golik.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId, userPassword;
		
		userId = request.getParameter("userId");
		userPassword = request.getParameter("userPassword");
		
		LoginService logServ = new LoginService();
		boolean result = logServ.authenticate(userId, userPassword);
		if(result) {
			response.sendRedirect("success.jsp");
			return;
		}
		else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
