package Vijay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FamilyServlet")
public class FamilyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String siblings = request.getParameter("siblings");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Family Details Submitted Successfully!</h2>");
        out.println("<p>Father Name: " + fatherName + "</p>");
        out.println("<p>Mother Name: " + motherName + "</p>");
        out.println("<p>No. of Siblings: " + siblings + "</p>");
    }
}
