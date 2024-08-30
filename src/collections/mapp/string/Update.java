package collections.mapp.string;

import java.util.HashMap;
import java.util.Map;

public class Update {
    public static void main(String[] args){
        Map<String, String> map = new HashMap();
        map.put("one", "ten");
        map.put("two", "twenty");
        map.put("three", "thirty");
        map.put("four", "forty");
        map.put("five", "fifty");

        System.out.println("Before update: " + map);

        map.put("four","fortyforty");

        System.out.println("After update: " + map);
    }
}
