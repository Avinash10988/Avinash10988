package Pattern_printing;

import java.util.Scanner;

public class mixture {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0) System.out.print((char)(j+64)+" ");
                else System.out.print(i+" ");
            }
            System.out.println( );
        }
    }
}
