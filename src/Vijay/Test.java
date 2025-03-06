package Vijay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test")
public class Test extends HttpServlet {

	       
		public void doget(HttpServletRequest req, HttpServletResponse res, ServletResponse response) throws IOException{
			String username =req.getParameter("username");
			String password =req.getParameter("password");
			
			response.setContentType("text/html");
			
			PrintWriter writer =res.getWriter();
			if("vijay".equals(username)||"vijay".equals(password)) {
			System.out.println("login success");
			}
			else {
				System.out.println("invalid deatils");
			}
			
			
		}
		}