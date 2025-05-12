import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name, int i) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double calculateTotalSpent() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet.");
            return 0.0;
        }
        return orders.stream()
                .mapToDouble(Order::calculateTotal)
                .sum();
    }

    public void addAccount(Account account1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public Iterable<Customer> getAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccounts'");
    }

    public String getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
}