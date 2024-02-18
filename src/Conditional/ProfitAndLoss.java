package Conditional;

import java.util.*;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int profit ;
        int loss;
        System.out.println("enter the cost price");
        int c= sc.nextInt();
        System.out.println("enter the selling price");
        int s= sc.nextInt();

        if (c>s){

            System.out.println("loss" +(c-s));
        }
        if(c<s) {
            System.out.println("gain"+(s-c));
        }
        else{
            System.out.println("no profit no loss");
        }
    }
}
