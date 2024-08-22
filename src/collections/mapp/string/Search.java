package collections.mapp.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static void main(String[] args){
        Map<String, String> map = new HashMap();
        map.put("one", "ten");
        map.put("two", "twenty");
        map.put("three", "thirty");
        map.put("four", "forty");
        map.put("five", "fifty");

        Object key;
        Object value;

        for(Map.Entry<String,String> entry: map.entrySet()){
            key = entry.getKey();
            value = entry.getValue();

            System.out.println("Element found at key: " + key);
        }
    }
}
