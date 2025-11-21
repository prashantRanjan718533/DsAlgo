package twopointers;

import java.util.Arrays;

public class ThreeSumClosest16 {
    // 3Sum Closest 16
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -1, 1, 2};
//        Input: nums = [-1,2,1,-4],    Output: 2
//        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
        int target = 1;
        Arrays.sort(arr);
        //-4,-4,-1,1,2
//        Arrays.stream(arr).forEach(System.out::println);

        int count = 0;
        int sum = 0;
        int sum1 =0;
        int sum2 =0;
        for (int i = 0; i < arr.length - 2; i++) {
            int low = 0;
            int high = arr.length - 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            while (low < high) {
                sum = arr[low] + arr[high] + arr[i];


                if (sum == target) {
                    high--;
                    low++;
                } else if (sum > target) {
                     sum1 = arr[low] + arr[high] + arr[i];
                    high--;
                } else {
                     sum2 = arr[low] + arr[high] + arr[i];
                    low++;
                }


                    sum = Integer.min(sum1,sum2);;

            }
        }
        System.out.println(sum);
    }
}
