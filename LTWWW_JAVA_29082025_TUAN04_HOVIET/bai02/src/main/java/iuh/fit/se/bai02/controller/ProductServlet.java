package iuh.fit.se.bai02.controller;

import iuh.fit.se.bai02.dao.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init() throws ServletException {
        productDAO = new ProductDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("products", productDAO.getAllProducts());
        request.getRequestDispatcher("productList.jsp").forward(request, response);
    }
}
