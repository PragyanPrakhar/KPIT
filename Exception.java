import java.util.*;

class Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            System.out.println("The result of division is: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        } finally {
            System.out.println("After catch block , Inside finally block");
        }
    }
}
    

