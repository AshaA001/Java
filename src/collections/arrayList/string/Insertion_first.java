package collections.arrayList.string;

import java.util.ArrayList;

public class Insertion_first {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("BMW");
        arrList.add("Benz");
        arrList.add("Audi");
        arrList.add("Fortuner");
        arrList.add("Skoda");
        arrList.add("Ford");

        System.out.println("Before insertion: " + arrList);

        arrList.add(0,"Mazda");

        System.out.println("After insertion: " + arrList);
    }
}
