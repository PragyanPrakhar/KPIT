import java.util.*;
public class Functional {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum=Arrays.stream(numbers).filter(n->n%2==0).map(n->n*n).sum();
        System.out.println("Sum of the squares of the even number is :->" + sum);
    }
}
