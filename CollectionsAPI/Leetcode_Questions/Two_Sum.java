import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (hs.contains(complement)) {
                result[0] = i;
                result[1] = i;
                break;
            }
            hs.add(nums[i]);
        }
        return result;
    }
}
