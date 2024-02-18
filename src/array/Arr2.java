package array;

public interface Arr2 {
    public static void main(String[] args) {
        int []arr={23,45,15,21,41,44};
        int sum=1;
        for (int i = 0; i <=5; i++) {
             sum=arr[i]*sum;

        }
        System.out.println(sum);
    }
}
