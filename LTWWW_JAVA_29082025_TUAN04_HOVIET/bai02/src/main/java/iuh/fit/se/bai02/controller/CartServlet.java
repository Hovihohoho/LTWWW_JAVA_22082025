package iuh.fit.se.bai02.controller;

import iuh.fit.se.bai02.dao.ProductDAO;
import iuh.fit.se.bai02.model.Product;
import iuh.fit.se.bai02.model.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init() throws ServletException {
        productDAO = new ProductDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");

        if (cart == null) cart = new HashMap<>();

        if ("add".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = productDAO.findById(id);
            if (product != null) {
                if (cart.containsKey(id)) {
                    cart.get(id).setQuantity(cart.get(id).getQuantity() + 1);
                } else {
                    cart.put(id, new CartItem(product, 1));
                }
            }
        } else if ("update".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            int qty = Integer.parseInt(request.getParameter("quantity"));
            if (cart.containsKey(id)) {
                if (qty > 0) {
                    cart.get(id).setQuantity(qty);
                } else {
                    cart.remove(id);
                }
            }
        } else if ("remove".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            cart.remove(id);
        }

        session.setAttribute("cart", cart);
        response.sendRedirect("cart");
    }
}
