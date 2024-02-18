package loops;

import java.sql.SQLOutput;
import java.util.*;
public class MultiplecationOfn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n=");
        int n= sc.nextInt();
        for(int i=0; i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
