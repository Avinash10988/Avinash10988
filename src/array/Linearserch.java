package array;

import java.util.Scanner;

public class Linearserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter x");
        int x = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean flag= false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag=true;
                break;
            }
            else System.out.println("not found");

        }
        if (flag == true) System.out.println("Element found ");
        else System.out.println("not found");
    }
}
