package twopointers;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 3,7,8,0, 1, 2, 4, 3};
        int target = 19;
        int low = 0;

        int res = Integer.MAX_VALUE;
        int n = arr.length;
        int sum = 0;
        for (int high = 0; high < n; high++) {
            sum = sum + arr[high];
            // Shrink the window from the left while sum is still >= target
            while (sum >= target) {
                res = Math.min(res, high - low + 1);
                sum = sum - arr[low];
                low++;
            }

        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(res);
        }
    }

}
