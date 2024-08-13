//Back end coding
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
// Validate user credentials
        if (validateUser(username, password)) {
            request.getSession().setAttribute("user", username);
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
    
    private boolean validateUser(String username, String password) {
        // Implement user validation logic (e.g., check against database)
        return true;
    }
}        
