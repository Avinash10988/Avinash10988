package loops;

import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a=");
        int a= sc.nextInt();
        System.out.print("Enter b=");
        int b= sc.nextInt();
        int g=0;
        for( int i=1; i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;
            }
        }
        System.out.println("gcd="+g);


    }
}
