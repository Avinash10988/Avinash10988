package Pattern_printing;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m :");
        int m= sc.nextInt();
        for (int i=1;i<=m;i++){//rows
            for(int j=1;j<=m;j++){//coloum
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
