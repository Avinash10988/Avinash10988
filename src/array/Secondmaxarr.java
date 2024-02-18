package array;

public class Secondmaxarr {
    public static void main(String[] args) {
        int arr[]= {56,53,56,15,45,124,24,214};
        int n= arr.length;
        int max=arr[0];
        for (int i = 1; i <n ; i++) {
            max=Math.max(max,arr[i]);

        }
        int smax=arr[0];
        for (int i = 1; i <n ; i++) {
            if (arr[i]!=max){
                smax=Math.max(smax,arr[i]);
            }

        }
        System.out.println(smax);
    }
}
