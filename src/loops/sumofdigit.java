package loops;
import java.util.*;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no :");
        int n= sc.nextInt();
        int sum=0;
//        for(int ld=0 ;n!=0;){
//            ld=n%10;
//            sum+=ld;
//            n/=10;
//        }
        while(n!=0){
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println("sum of digit :"+sum);
    }
}
