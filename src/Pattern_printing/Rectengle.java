package Pattern_printing;

import java.util.*;
public class Rectengle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m & n:");
        int m= sc.nextInt();
        int n= sc.nextInt();
        for (int i=1;i<=m;i++){//rows
            for(int j=1;j<=n;j++){//coloum
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
