package Patterns.twopointers;

import java.util.Arrays;

public class TwoSumtwo {
    public static void main(String[] args) {
        int arr [] = {2,7,10,13,14};
        int target = 17;
        int[] res = twousmtwo(arr, target);
        Arrays.stream(res).forEach(System.out::println);
    }
    public static int[] twousmtwo(int[] numbers, int target){
        int a=0;
        int b= numbers.length-1;
        int[] res = new int [2];
        while(a<b){
            if(numbers[a]+numbers[b]==target){
                res[0]= a+1;
                res[1]= b+1;
                return  res;
            }
            else if(numbers[a]+numbers[b]<target){
                a++;
            }
            else{
                b--;
            }
        }
        System.out.println(a+" "+b);

        return res;
    }
}
