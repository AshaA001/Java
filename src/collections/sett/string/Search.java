package collections.sett.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Search {
    public static void main(String[] args){
        Set<String> set = new HashSet();
        set.add("ten");
        set.add("twenty");
        set.add("thirty");
        set.add("forty");
        set.add("fifty");

        int value=search("forty",set);

        if(value==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element " +"forty" + " found");
        }
    }
    private static int search(String element, Set<String> s) {
        for(int i =0; i< s.size(); i++) {
            if(s.contains(element)){
                return 0;
            }
        }
        return -1;
    }
}
