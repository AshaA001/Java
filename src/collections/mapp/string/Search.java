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

        int value=search("forty",map);

        if(value==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element " +"forty" + " found");
        }

    }

    private static int search(String element, Map<String, String> m) {
        for(Map.Entry<String,String> entry: m.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();

            if(value.equals("forty")){
                return 0;
            }
        }

        return -1;
    }

}
