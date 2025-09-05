package iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.controller;


import iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    @WebServlet("/user")
    public class UserServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        // Lưu danh sách users tạm thời
        private List<User> userList = new ArrayList<>();

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Hiển thị danh sách user
            request.setAttribute("userList", userList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
            dispatcher.forward(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String reEmail = request.getParameter("reEmail");
            String password = request.getParameter("password");
            String birthday = request.getParameter("birthday");
            String gender = request.getParameter("gender");

            // Validate đơn giản
            String errorMsg = null;
            if (firstName == null || firstName.isEmpty() ||
                    lastName == null || lastName.isEmpty() ||
                    email == null || email.isEmpty() ||
                    reEmail == null || reEmail.isEmpty() ||
                    password == null || password.isEmpty()) {
                errorMsg = "Please fill all required fields";
            } else if (!email.equals(reEmail)) {
                errorMsg = "Email and Re-enter Email do not match";
            }

            if (errorMsg != null) {
                request.setAttribute("errorMsg", errorMsg);
                request.getRequestDispatcher("register.jsp").forward(request, response);
                return;
            }

            // Tạo User mới và thêm vào danh sách
            User user = new User(firstName, lastName, email, password, birthday, gender);
            userList.add(user);

            // Chuyển đến trang danh sách user
            response.sendRedirect("user");
        }
}
