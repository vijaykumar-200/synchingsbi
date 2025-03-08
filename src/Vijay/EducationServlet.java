package Vijay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EducationServlet")
public class EducationServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qualification = request.getParameter("qualification");
        String passoutYear = request.getParameter("passoutYear");
        String percentage = request.getParameter("percentage");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Education Details Submitted Successfully!</h2>");
        out.println("<p>Highest Qualification: " + qualification + "</p>");
        out.println("<p>Passout Year: " + passoutYear + "</p>");
        out.println("<p>Percentage: " + percentage + "</p>");
    }
}
