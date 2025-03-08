package Vijay;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Hardcoded credentials for demonstration
    private static final String USERNAME = "vijay";
    private static final String PASSWORD = "password123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get username and password from request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Simple authentication check
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // Create session and redirect to welcome page
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("Dashboard.html");
        } else {
            // Invalid login, display error message
            out.println("<html><body>");
            out.println("<h3 style='color:red; text-align:center;'>Invalid username or password!</h3>");
            out.println("<a href='Login.html' style='text-align:center; display:block;'>Go back to Login</a>");
            out.println("</body></html>");
        }
        out.close();
    }
}
