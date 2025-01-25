// Imagine a payment processing system where different types of payments (e.g., Credit Card, PayPal, UPI) need to be handled.

abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    public void paymentSummary() {

        System.out.println("Payment of amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    private String CardNumber;

    public CreditCardPayment(double amount, String CardNumber) {
        super(amount);
        this.CardNumber = CardNumber;
    }

    void processPayment() {
        paymentSummary();
        System.out.println("Credit Card Payment Processed");
    }
}

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    void processPayment() {
        paymentSummary();
        System.out.println("PayPal Payment Processed");
    }
}

public class Real_Life_Scenario_Of_AbstractionAndInheritance {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(5000, "2121-2121-2212-1221");
        Payment payPalPayment = new PayPalPayment(1000, "abcd@gmail.com");
        creditCardPayment.processPayment();
        payPalPayment.processPayment();

    }
}
