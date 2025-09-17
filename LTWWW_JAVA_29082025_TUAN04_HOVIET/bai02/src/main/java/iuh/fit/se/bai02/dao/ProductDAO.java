package iuh.fit.se.bai02.dao;

import iuh.fit.se.bai02.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Laptop Dell", 1200));
        products.add(new Product(2, "iPhone 15", 999));
        products.add(new Product(3, "Tai nghe Sony", 199));
        products.add(new Product(4, "Chuột Logitech", 49));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
