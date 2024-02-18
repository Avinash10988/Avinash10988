package Conditional;

import java.util.*;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the x ");
        int x=sc.nextInt();
        System.out.println("enter the y");
        int y= sc.nextInt();
        if(x>0 && y>0) System.out.println(x+ y+ "is in first quadrant");
        if(x>0 && y<0) System.out.println(x+ y+ "is in second quadrant");
        if(x<0 && y<0) System.out.println(x+ y+ "is in third quadrant");
        if(x<0 && y>0) System.out.println(x+ y+ "is in fourth quadrant");
        if(x==0 && y==0) System.out.println(x+ y+ "is in origin");
        if(x!=0 && y==0) System.out.println(x+ y+ "is in y axis");
        if(x!=0 && y==0) System.out.println(x+ y+ "is in x axis");
    }
}
