package iuh.fit.se.bai02.model;

public class CartItem {
    private iuh.fit.se.bai02.model.Product product;
    private int quantity;

    public CartItem(iuh.fit.se.bai02.model.Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public iuh.fit.se.bai02.model.Product getProduct() { return product; }
    public void setProduct(iuh.fit.se.bai02.model.Product product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getTotal() {
        return product.getPrice() * quantity;
    }
}
