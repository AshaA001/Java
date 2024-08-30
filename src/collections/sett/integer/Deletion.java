package collections.sett.integer;

import collections.sett.object.Employee;

import java.util.*;

public class Deletion {
    public static void main(String[] args){
        Set<Integer> set = new HashSet();
        set.add(10);
        set.add(16);
        set.add(22);
        set.add(13);
        set.add(44);

        System.out.println("Before deletion: " + set);

        set.remove(22);

        System.out.println("After deletion: " + set);
    }
}
