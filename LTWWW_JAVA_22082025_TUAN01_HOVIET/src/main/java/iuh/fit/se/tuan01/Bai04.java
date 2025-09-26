package iuh.fit.se.tuan01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "user-pr",
        urlPatterns = {"/user-pr", "/pr"},
        initParams ={
                @WebInitParam(name = "username", value="HoZii"),
                @WebInitParam(name = "password", value = "yeye1234")

        })
/**
 * @author HoViet-22694791
 */

public class Bai04 extends HttpServlet {

    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        username = config.getInitParameter("username");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html>" + "<body>");
        out.println("<h1>" + username + "</h1>");
        out.println("<h2 style='color: red'>" + "Username: " + this.getServletConfig().getInitParameter("username") + "</h2>");
        out.println("<h2 style='color: green'>" + this.getServletContext().getInitParameter("appName") + "</h2>");
        out.println("</body>" + "</html>");

    }

    public void destroy(){}
}
