package iuh.fit.se.tuan01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
/**
 * @author HoViet-22694791
 */
public class Bai02 extends HttpServlet {
        private String mess;
        public void init(){
                mess = "Xin chao Viet Nam";
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+ mess + "</h1>");
        out.println("</body></html>");
    }
    public void destroy(){

    }
}
