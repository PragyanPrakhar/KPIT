import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int cp = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > cp) {
                profit = Math.max(profit, prices[i] - cp);
            } else {
                cp = prices[i];
            }

        }
        return profit;
    }

}
