package collections.mapp.integer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Search {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 10);
        map.put(1, 16);
        map.put(2, 22);
        map.put(3, 13);
        map.put(4, 44);

        int value=search(44,map);

        if(value==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element " +44 + " found");
        }

    }

    private static int search(int element, Map<Integer, Integer> m) {
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();

            if(value.equals(44)){
                return 0;
            }
        }

        return -1;
    }
}
