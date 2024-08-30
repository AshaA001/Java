package collections.sett.integer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Search {
    public static void main(String[] args){
        Set<Integer> set = new HashSet();
        set.add(10);
        set.add(16);
        set.add(22);
        set.add(13);
        set.add(44);

        int value=search(44,set);

            if(value==-1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Element " +44 + " found");
            }
        }


    private static int search(int element, Set<Integer> s) {
        for(int i =0; i< s.size(); i++) {
            if(s.contains(element)){
                return 0;
            }
        }
        return -1;
    }
}
