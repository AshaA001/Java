package collections.mapp.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Deletion {
    public static void main(String[] args){
        Map<String, String> map = new HashMap();
        map.put("one", "ten");
        map.put("two", "twenty");
        map.put("three", "thirty");
        map.put("four", "forty");
        map.put("five", "fifty");

        System.out.println("Before deletion: " + map);

        map.remove("two");

        System.out.println("After deletion: " + map);
    }
}
