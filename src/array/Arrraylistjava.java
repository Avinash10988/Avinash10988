package array;

import java.util.ArrayList;

public class Arrraylistjava {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(34);
        System.out.println(list+" "+list.size());
        list.add(65);
        System.out.println(list+" "+list.size());
        list.add(70);
        System.out.println(list+" "+list.size());
        list.add(890);
        System.out.println(list+" "+list.size());
        list.remove(2);
        System.out.println(list+" "+list.size());
    }
}
