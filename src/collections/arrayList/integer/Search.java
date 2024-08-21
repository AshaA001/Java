package collections.arrayList.integer;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(16);
        arrList.add(22);
        arrList.add(13);
        arrList.add(44);
        arrList.add(15);

        int pos = arrList.indexOf(44);

        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }
}
