package Pattern_printing;

import java.util.Scanner;

public class Special1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(n%2==0) System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
