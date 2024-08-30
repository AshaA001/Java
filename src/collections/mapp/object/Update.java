package collections.mapp.object;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Update {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1,emp1);
        map.put(2,emp2);
        map.put(3,emp3);

        System.out.println("Before update: ");
        for(Map.Entry<Integer,Employee> e : map.entrySet()){
            System.out.println("Key: " + e.getKey());
            Employee emp = e.getValue();
            System.out.println("Name: " + emp.name);
            System.out.println("Age: " + emp.age);
            System.out.println("Address: " + emp.address);
            System.out.println("Joining Date: " + emp.joiningDate);
            System.out.println("\n");
        }

        emp2.name= "Katie2";
        emp2.age= 50;
        emp2.address= "Addr2";
        emp2.joiningDate= new Date(2021,07,5);

        map.put(2,emp2);

        System.out.println("After update: ");
        for(Map.Entry<Integer,Employee> e : map.entrySet()){
            System.out.println("Key: " + e.getKey());
            Employee emp = e.getValue();
            System.out.println("Name: " + emp.name);
            System.out.println("Age: " + emp.age);
            System.out.println("Address: " + emp.address);
            System.out.println("Joining Date: " + emp.joiningDate);
            System.out.println("\n");
        }
    }
}
