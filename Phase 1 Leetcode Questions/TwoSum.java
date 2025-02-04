import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("The indices of the two numbers are: " + result[0] + " and " + result[1]);
        sc.close();
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}