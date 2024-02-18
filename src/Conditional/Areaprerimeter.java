package Conditional;

import java.util.*;
public class Areaprerimeter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enyer the length");
        int l= sc.nextInt();
        System.out.println("enter the breadth ");
        int b =sc.nextInt();
        int A= l*b;
        int p= 2*(l=b);
        if (A>p){
            System.out.println("Area is bigger");
        }
        else System.out.println("perimeter is bigger");
    }
}
