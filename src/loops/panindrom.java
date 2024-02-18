package loops;

public class panindrom {
    public static void main(String[] args) {
        String string = "Avinash";
        boolean flag = true;
        string = string.toLowerCase();
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
               }
            }
        if(flag) System.out.println("String is palindrome");
        else System.out.println(" string is not a palindrome");
    }

}

