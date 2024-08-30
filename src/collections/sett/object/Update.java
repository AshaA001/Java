package collections.sett.object;

import java.util.*;

public class Update {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Set<Employee> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);

        System.out.println("Before update: ");

        for(Employee e:set) {
            System.out.println(e.name);
            System.out.println(e.age);
            System.out.println(e.address);
            System.out.println(e.joiningDate);
            System.out.println("\n");
        }


        emp2.name= "Katie2";
        emp2.age= 50;
        emp2.address= "Addr2";
        emp2.joiningDate= new Date(2021,07,5);

        set.add(emp2);

        System.out.println("After update: ");

        for(Employee e:set) {
            System.out.println(e.name);
            System.out.println(e.age);
            System.out.println(e.address);
            System.out.println(e.joiningDate);
            System.out.println("\n");
        }
    }

}

