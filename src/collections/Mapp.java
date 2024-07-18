package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {
    public static void main(String[] args) {
       // Map<Integer,String> map = new TreeMap<>(); // Keys are sorted and stored. Insertion order does not matter
        Map<Integer,String> map = new HashMap<>(); //Random order

        map.put(50, "A");
        map.put(100,"B");
        map.put(1,"C");
        map.put(5, "D");
        map.put(10,"E");
        map.put(2,"F");
        map.put(7, "G");
        map.put(180,"H");
        map.put(109,"I");

        for(java.util.Map.Entry<Integer, String> entries : map.entrySet()){
            System.out.println(entries.getKey() + " " + entries.getValue());
        }

    }
}
