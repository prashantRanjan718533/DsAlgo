package twopointers;

import java.util.Arrays;

public class SortedArray {
    //need to find index, can't sort , it will change the index and 2 pointer is here not helpful,
    // use hashmap Recommended - O(n))
    public static void main(String[] args) {
        int arr [] = new int[]{2,7,11,15};
        int target = 18;
        Arrays.stream(res( arr,  target)).forEach(System.out::println);
    }
    private static int []  res(int[] arr, int target) {
        int res [] = new int[2];
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int sum  = arr[low]+ arr[high];
            if(sum== target){
                res[0]= low;
                res[1]= high;
                return res;
            }
            else if(sum<target){
                low++;
            }
            else {
                high--;
            }
        }

        return res;
    }
}
