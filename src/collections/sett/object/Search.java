package collections.sett.object;

import java.util.*;

public class Search {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Set<Employee> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);

        int value = search(emp2, set);

        if(value==-1){
            System.out.println("Employee not found");
        }
        else{
            System.out.println("Employee " +emp2.name + " found");
        }

    }

    private static int search(Employee element, Set<Employee> s) {
        for(int i =0; i< s.size(); i++) {
            if(s.contains(element)){
                return 0;
            }
        }
        return -1;
    }
}
