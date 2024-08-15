//Back end coding for the Login
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
// Validate the user credentials that are necessary
        if (validateUser(username, password)) {
            request.getSession().setAttribute("user", username);
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
    // Private boolean
    private boolean validateUser(String username, String password) {
        // Implement user validation logic (e.g., check against database)
        return true;
    }
} 








