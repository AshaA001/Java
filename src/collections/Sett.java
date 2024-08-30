package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //internally uses HashMap
        // duplicates are not stored, output is not sorted, order of insertion not considered
        //when run again, output order will not change unless we insert/delete element in the Set.
        // - because, the hash code of the values we insert is not going to change.
        // when we put something to map, hash map will calculate the hash code
        set.add(1);
        set.add(34);
        set.add(-1);
        set.add(-1);
        set.add(104);
        set.add(-1);
        set.add(90);
        set.add(21);
        set.add(-5);
        set.add(-1);

        for(Integer i:set){
            System.out.println(i);
        }
        System.out.println("\n");

        Set<Integer> treeset = new TreeSet<>(); // sorted order
        treeset.add(1);
        treeset.add(34);
        treeset.add(-1);
        treeset.add(-1);
        treeset.add(104);
        treeset.add(-1);
        treeset.add(90);
        treeset.add(21);
        treeset.add(-5);
        treeset.add(-1);

        for(Integer j:treeset){
            System.out.println(j);
        }
    }
}
