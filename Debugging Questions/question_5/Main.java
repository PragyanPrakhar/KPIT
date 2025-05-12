
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        Order order1 = new Order();
        order1.addProduct(new Product("Product 1", 10.99, 2));
        order1.addProduct(new Product("Product 2", 5.99, 3));

        Order order2 = new Order();
        order2.addProduct(new Product("Product 3", 7.99, 1));
        order2.addProduct(new Product("Product 4", 12.99, 2));

        customer.addOrder(order1);
        customer.addOrder(order2);

        System.out.println("Total spent by customer: " + customer.calculateTotalSpent());
    }
}