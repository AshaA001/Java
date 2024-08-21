package collections.arrayList.object;

import java.util.ArrayList;
import java.util.Date;

public class Deletion {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        ArrayList<Employee> arrList = new ArrayList<Employee>();
        arrList.add(emp1);
        arrList.add(emp2);
        arrList.add(emp3);

        System.out.println("Before insertion: ");

        for(Employee e : arrList){
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Address: " + e.address);
            System.out.println("Joining Date: " + e.joiningDate);
            System.out.println("\n");
        }

        arrList.remove(emp2);

        System.out.println("After deletion: ");

        for(Employee e : arrList){
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Address: " + e.address);
            System.out.println("Joining Date: " + e.joiningDate);
            System.out.println("\n");
        }
    }
}
