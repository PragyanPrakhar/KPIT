import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        /* Modified the product class to manage the quantity of each product and to
        prevent the negative price of the products(validated the product class.)*/  
        return products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }
}