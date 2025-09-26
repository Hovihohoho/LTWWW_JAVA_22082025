package iuh.fit.se.tuan01;

import com.fasterxml.jackson.databind.ObjectMapper;
import iuh.fit.se.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "user", value = "/user-info")
/**
 * @author HoViet-22694791
 */
public class Bai03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("23A","Ho Viet",20);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);

        resp.getWriter().write(json);

    }
    public void destroy() {

    }
}
