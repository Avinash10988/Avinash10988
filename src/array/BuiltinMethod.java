package array;

import java.util.Arrays;

public class BuiltinMethod {
    public static void main(String[] args) {
        int arr[]= {23,6,956,45,45,1574,541};
        //for each loop
        int n=arr.length;
        for(int x:arr){
            System.out.print(x+" ");
        }
        //sorting of array
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
