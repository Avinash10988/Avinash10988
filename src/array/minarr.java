package array;

public class minarr {
    public static void main(String[] args) {
        int arr[]={23,165,62,15,856,45};
        int n= arr.length;
        int min=arr[0];
        for (int i = 1; i <n ; i++) {
           min= Math.min(min,arr[i]);

        }
        System.out.println(min);
    }
}
