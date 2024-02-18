package loops;

import java.util.*;
public class compositeNo {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int a=0;

        for (int i = 2; i <=n-1; i++) {
            if (n%i==0) {
                System.out.println("composite no");
                a=1;
            }
            break;
        }
        if(n==1) System.out.println("neiyher prime nor composite");
        else if(a==0) System.out.println("prime no");
    }
}
