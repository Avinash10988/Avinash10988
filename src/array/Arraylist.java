package array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(5);
        arr.add(0,10);
        arr.add(1,102);
        arr.add(2,130);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println(arr);
        for( int i=0;i<=4;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.set(2,70);
        System.out.println(arr);
        arr.add(90);//push back
        for( int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }


    }
}
