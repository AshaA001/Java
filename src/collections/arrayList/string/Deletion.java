package collections.arrayList.string;

import java.util.ArrayList;

public class Deletion {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("BMW");
        arrList.add("Benz");
        arrList.add("Audi");
        arrList.add("Fortuner");
        arrList.add("Skoda");
        arrList.add("Ford");

        System.out.println("Before deletion: " + arrList);

        arrList.remove("Fortuner"); //doubt?

        System.out.println("After deletion: " + arrList);
    }
}
