package Vijay;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the action parameter to identify which form was submitted
        String action = request.getParameter("action");

        // Get the current session or create a new one
        HttpSession session = request.getSession();

        // Prepare response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Process form based on action
        switch (action) {
            case "address":
                String city = request.getParameter("city");
                String state = request.getParameter("state");
                String country = request.getParameter("country");

                // Save to session
                session.setAttribute("city", city);
                session.setAttribute("state", state);
                session.setAttribute("country", country);

                out.println("<html><body>");
                out.println("<h3>Address details saved successfully!</h3>");
                out.println("<a href='Dashboard.html'>Go Back to Dashboard</a>");
                out.println("</body></html>");
                break;

            case "education":
                String qualification = request.getParameter("qualification");
                String passoutYear = request.getParameter("passout-year");
                String percentage = request.getParameter("percentage");

                // Save to session
                session.setAttribute("qualification", qualification);
                session.setAttribute("passoutYear", passoutYear);
                session.setAttribute("percentage", percentage);

                out.println("<html><body>");
                out.println("<h3>Education details saved successfully!</h3>");
                out.println("<a href='Dashboard.html'>Go Back to Dashboard</a>");
                out.println("</body></html>");
                break;

            case "family":
                String fatherName = request.getParameter("father-name");
                String motherName = request.getParameter("mother-name");
                String siblings = request.getParameter("siblings");

                // Save to session
                session.setAttribute("fatherName", fatherName);
                session.setAttribute("motherName", motherName);
                session.setAttribute("siblings", siblings);

                out.println("<html><body>");
                out.println("<h3>Family details saved successfully!</h3>");
                out.println("<a href='Dashboard.html'>Go Back to Dashboard</a>");
                out.println("</body></html>");
                break;

            default:
                out.println("<html><body>");
                out.println("<h3>Invalid action!</h3>");
                out.println("<a href='Dashboard.html'>Go Back to Dashboard</a>");
                out.println("</body></html>");
                break;
        }
        out.close();
    }
}
