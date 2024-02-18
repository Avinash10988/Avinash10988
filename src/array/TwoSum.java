package array;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr= { 3,5,5,8,6,7,5,2,8,5,0,9};
        int x=10;
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==10){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
