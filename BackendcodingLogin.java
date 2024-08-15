//Back end coding for the Login


//3.2 a-e

// (a) Class name for this code is login for the fx

//  (b)  8/14/24

// (c) Felix Montes-Flores

// (d) This class is about putting a customer's information on a page which will confirm their credentials

// (e) In the LoginServlet function of this class, a username is requested to be inputted as well as a password.
// Then, the username and password is validated so that when the system looks at the info, it recognizes it and 
// confirms them and shows a reservation that they have done.






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








