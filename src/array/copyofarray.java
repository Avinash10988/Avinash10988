package array;

import java.util.Arrays;

public class copyofarray {
    public static void main(String[] args) {
        int arr[]= {23,6,956,45,45,1574,541};
        for(int x:arr){
            System.out.print(x+" ");
        }
      System.out.println();
//        int[] nums=arr;//Shallow copy
//        nums[0]=70;
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//
//        }
        int[] brr= Arrays.copyOf(arr, arr.length);//Deep copy
        for(int ele: brr){
            System.out.print(ele+" ");
        }
        int[]crr= new int[arr.length];
        for(int i=0;i<arr.length;i++){
           crr[i]=arr[i];
        }
        System.out.println();
        crr[0]=70;
        System.out.println(crr[0]);


    }
}
