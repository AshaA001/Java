package collections.sett.integer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Insertion {
    public static void main(String[] args){
        Set<Integer> set = new HashSet();
        set.add(10);
        set.add(16);
        set.add(22);
        set.add(13);
        set.add(44);

        System.out.println("Before insertion: " + set);

        set.add(100);

        System.out.println("After insertion: " + set);
    }
}
