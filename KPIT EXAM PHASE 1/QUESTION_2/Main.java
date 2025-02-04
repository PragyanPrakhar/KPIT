package QUESTION_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = Operations.createObjects();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close(); 

        Operations.displayNChassisLength(cars, N);
        Operations.findMaxChassisLength(cars);
    }
}
