import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestConsecutive(arr));
    }

    private static int longestConsecutive(int arr[]) {
        if (arr.length == 0)
            return 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr)
            hs.add(i);
        int res = 0;
        for (Integer x : hs) {
            if (!hs.contains(x - 1)) {
                int curr = 1;
                while (hs.contains(x + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
