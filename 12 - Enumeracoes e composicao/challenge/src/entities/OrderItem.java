package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    Product product; // 1 to 1 relation

    public OrderItem(Double price, Product product, Integer quantity) {
        this.price = price;
        this.product = product;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double subTotal() {
        return quantity*price;
    }

    public String toString(){
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
