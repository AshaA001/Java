package collections.sett.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Insertion {
    public static void main(String[] args){
        Set<String> set = new HashSet();
        set.add("ten");
        set.add("twenty");
        set.add("thirty");
        set.add("forty");
        set.add("fifty");

        System.out.println("Before insertion: " + set);

        set.add("sixty");

        System.out.println("After insertion: " + set);
    }
}
