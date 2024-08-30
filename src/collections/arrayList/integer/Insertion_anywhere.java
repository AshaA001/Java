package collections.arrayList.integer;

import java.util.ArrayList;

public class Insertion_anywhere {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(16);
        arrList.add(22);
        arrList.add(13);
        arrList.add(44);
        arrList.add(15);

        System.out.println("Before insertion: " + arrList);

        arrList.add(3,100);

        System.out.println("After insertion: " + arrList);
    }

}
