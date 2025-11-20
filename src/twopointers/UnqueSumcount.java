package twopointers;

public class UnqueSumcount {
    public static void main(String[] args) {
        int[] arr  = new int[]{1, 1, 2, 45, 46, 46};
        int low =0;
        int high = arr.length-1;
        int target =  47;
        int count=0;
        while (low<high){
//            if( arr[low]>1 && arr [low]==arr[low-1]){
//                continue;
//            }
            int sum = arr[low]+arr[high];
            if(sum== target){
                count++;
                while (low<high &&  arr[low]==arr[low+1]){
                    low++;
                }
                while (low<high &&  arr[high]==arr[high-1]){
                    high--;
                }
                low++;
                high--;
            }
            else if (sum<target) {
                    low++;

            }
            else {
                high--;
            }
        }
        System.out.println(count);
    }
}
