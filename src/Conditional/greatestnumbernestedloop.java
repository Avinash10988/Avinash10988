package Conditional;

import java.util.*;
public class greatestnumbernestedloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no:");
        int a=sc.nextInt();
        System.out.println("enter the second no:");
        int b=sc.nextInt();
        System.out.println("enter the third no:");
        int c=sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a+" is greatest");
            else System.out.println(c+" is greatest");
        }
        else {
            if(b>c) System.out.println(b+"is greatest");
            else System.out.println(c+" is greatest");
        }
    }
}
