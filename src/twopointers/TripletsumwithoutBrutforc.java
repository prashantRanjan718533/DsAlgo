package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsumwithoutBrutforc {
    public static void main(String[] args) {
        int [] nums = new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        System.out.println(Arrays.toString(nums));
//        step 1 : sort the array to do it in 2 pointer
        Arrays.sort(nums);
       //[-4, -1, -1, 0, 1, 2]
        System.out.println(Arrays.toString(nums));

        List<List<Integer>> output = new ArrayList<>();
//        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int low = i+1;
           int high = nums.length-1;

           while (low<high){
               List<Integer> res = new ArrayList<>();
               int sum = nums[low]+nums[high];

               if(sum==-(nums[i])){
                   res.add(nums[i]);
                   res.add(nums[low]);
                   res.add(nums[high]);
                   output.add(res);
                   while (low < high && nums[low] == nums[low + 1]) low++;
                   while (low < high && nums[high] == nums[high - 1]) high--;

                   low++;
                   high--;
               }
               else if(sum>-nums[i]){
                    high--;
               }
               else {
                   low++;
               }
           }

        }

        System.out.println(output);
    }
}
