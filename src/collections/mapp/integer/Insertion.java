package collections.mapp.integer;

import java.util.HashMap;
import java.util.Map;

public class Insertion {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 10);
        map.put(1, 16);
        map.put(2, 22);
        map.put(3, 13);
        map.put(4, 44);

        System.out.println("Before insertion: " + map);

        map.put(5,15);

        System.out.println("After insertion: " + map);
    }
}
