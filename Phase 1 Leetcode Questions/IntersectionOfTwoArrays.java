import java.util.*;

public class IntersectionOfTwoArrays {
    private static int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : arr1) {
            set1.add(n);
        }
        for (int n : arr2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        int[] result = new int[set2.size()];
        int index = 0;
        for (int n : set2) {
            result[index++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the number of elements in the second array");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        int[] result = intersection(arr1, arr2);
        System.out.println("Intersection of the two arrays is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
