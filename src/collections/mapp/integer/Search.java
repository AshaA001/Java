package collections.mapp.integer;

import java.util.HashMap;
import java.util.Map;

public class Search {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 10);
        map.put(1, 16);
        map.put(2, 22);
        map.put(3, 13);
        map.put(4, 44);

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println("Element found at key: " + key);
        }

    }
}
