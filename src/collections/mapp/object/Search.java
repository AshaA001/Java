package collections.mapp.object;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Search {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1,emp1);
        map.put(2,emp2);
        map.put(3,emp3);

        int value = search(emp2, map);

        if(value==-1){
            System.out.println("Employee not found");
        }
        else{
            System.out.println("Employee " +emp2.name + " found");
        }
    }

    private static int search(Employee element, Map<Integer, Employee> m) {
        for(Map.Entry<Integer, Employee> entry: m.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();

            if(value.equals(element)){
                return 0;
            }
        }

        return -1;
    }
}
