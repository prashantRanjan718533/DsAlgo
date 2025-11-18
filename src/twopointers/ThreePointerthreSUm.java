package twopointers;

import java.util.*;

public class ThreePointerthreSUm
{
    public static void main(String[] args) {
        int nums [] = new int[] {-1,0,1,2,-1,-4};

        Set<List<Integer>> result = new HashSet<>();

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if( nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
