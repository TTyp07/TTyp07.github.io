import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {

    private final ArrayList<String> messages = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        request.setCharacterEncoding("UTF-8");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Get user input
            String user = request.getParameter("user");
            String message = request.getParameter("message");

            // Add message to list
            messages.add(user + "---" + message);

            // Display messages
            out.println("<html>");
            out.println("<head>");
            out.println("<title>留言板</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>留言板</h1>");
            out.println("<hr/>");

            for (String m : messages) {
                out.println("<p>" + m + "</p>");
            }

            out.println("<hr/>");
            out.println("<a href=\"index.jsp\">返回留言页面</a>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
