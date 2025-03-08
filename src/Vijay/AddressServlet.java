package Vijay;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddressServlet")
public class AddressServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Address Details Submitted Successfully!</h2>");
        out.println("<p>City: " + city + "</p>");
        out.println("<p>State: " + state + "</p>");
        out.println("<p>Country: " + country + "</p>");
    }
}
