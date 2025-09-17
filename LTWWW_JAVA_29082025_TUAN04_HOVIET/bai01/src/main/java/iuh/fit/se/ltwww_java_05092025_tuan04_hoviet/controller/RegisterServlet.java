package iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.controller;



import iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.dao.UserDAO;
import iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        userDAO = new UserDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String reEmail = request.getParameter("reemail");
        String password = request.getParameter("password");
        String month = request.getParameter("month");
        String day = request.getParameter("day");
        String year = request.getParameter("year");
        String gender = request.getParameter("gender");

        // kiểm tra email nhập lại có khớp không
        if (!email.equals(reEmail)) {
            request.setAttribute("error", "Email không khớp, vui lòng nhập lại!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        // gộp birthday thành chuỗi
        String birthday = day + "/" + month + "/" + year;

        User user = new User(0, firstName, lastName, email, password, birthday, gender);
        userDAO.addUser(user);

        request.setAttribute("users", userDAO.getAllUsers());
        request.getRequestDispatcher("userList.jsp").forward(request, response);
    }
}
