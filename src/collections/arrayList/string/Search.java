package collections.arrayList.string;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("BMW");
        arrList.add("Benz");
        arrList.add("Audi");
        arrList.add("Fortuner");
        arrList.add("Skoda");
        arrList.add("Ford");

        int pos = arrList.indexOf("Skoda");

        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }
}
