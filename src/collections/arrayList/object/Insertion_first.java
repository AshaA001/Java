package collections.arrayList.object;

import collections.arrayList.object.Employee;

import java.util.ArrayList;
import java.util.Date;

public class Insertion_first {
    public static void main(String[] args){

        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));

        ArrayList<Employee> arrList = new ArrayList<Employee>();
        arrList.add(emp1);
        arrList.add(emp2);

        System.out.println("Before insertion: ");

        for(Employee e : arrList){
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Address: " + e.address);
            System.out.println("Joining Date: " + e.joiningDate);
            System.out.println("\n");
        }

        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        arrList.add(0,emp3);

        System.out.println("After insertion: ");

        for(Employee e : arrList){
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Address: " + e.address);
            System.out.println("Joining Date: " + e.joiningDate);
            System.out.println("\n");
        }
    }
}
