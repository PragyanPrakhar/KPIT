package QUESTION_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Operations operations = new Operations(number);
        operations.findFactorial(number);
        operations.findFirstNFibonacciNumber(number);
        String input = sc.next();
        operations.findVowelCharacters(input);
    }
}
