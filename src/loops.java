import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = 1;
        int max= a;
        if(b > max){
             max =b;
        }
        if (c >max){
            max = c;
        }
        System.out.println(max);


    }
}
