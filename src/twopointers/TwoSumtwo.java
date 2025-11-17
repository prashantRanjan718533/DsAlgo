package dsalgo.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumtwo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6,13,22,45,99, 210, 666};
        int target = 667;
        Arrays.stream(twoSum(arr, target)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] arr, int target) {
        int a=0;
        int b=arr.length-1;
        int[] res = new int[2];
         while(a<b){
            if(arr[a]+arr[b]==target){
                res[0]= a+1;
                res[1] = b+1;
            }

             if(arr[a]+arr[b]>target){
                 b--;
             }
             else {
                 a++;
             }
        }
        return res;
    }
}
