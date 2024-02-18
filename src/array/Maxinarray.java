package array;

import java.util.Scanner;

public class Maxinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) {
                max=arr[i];
            };

        }
        System.out.println( "Maximum no is :" + max);
    }
}
