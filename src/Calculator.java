import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans= 0;
        while(true){
            char op= sc.next().trim().charAt(0);
            if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%'){
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                if (op=='+'){
                    ans=n1+n2;
                }
                if(op=='-'){
                    ans=n1-n2;
                }
                if(op=='*'){
                    ans=n1*n2;
                }
                if(op=='/'){
                    if(n2!=0){
                        ans=n1/n2;
                    }
                }
                if(op=='%'){
                    if (n2!=0){
                        ans=n1%n2;
                    }
                }else if (op == 'x'|| op == 'X'){
                    break;
                }else{
                    System.out.println("invalid operation");
                }
            }
            System.out.println(ans);
        }


    }
}
