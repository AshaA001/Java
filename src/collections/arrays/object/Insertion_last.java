package collections.arrays.object;

import java.util.Date;

public class Insertion_last {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));

        Employee[] emp= new Employee[10];
        emp[0] = emp1;
        emp[1] = emp2;

        int n = 2;
        int capacity = emp.length;
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        System.out.println("Before insertion: ");

        for(int i = 0; i<n; i++)
        {
            System.out.println("Name: " + emp[i].name);
            System.out.println("Age: " + emp[i].age);
            System.out.println("Address: " + emp[i].address);
            System.out.println("Joining Date: " + emp[i].joiningDate);
            System.out.println("\n");
        }

        n = insertLast(emp, n, emp3, capacity);

        System.out.println("After insertion: ");

        for(int i = 0; i<n; i++)
        {
            System.out.println("Name: " + emp[i].name);
            System.out.println("Age: " + emp[i].age);
            System.out.println("Address: " + emp[i].address);
            System.out.println("Joining Date: " + emp[i].joiningDate);
            System.out.println("\n");
        }
    }

    private static int insertLast(Employee[] emp, int n, Employee e, int capacity) {
        if(n>=capacity){
            return n;
        }
        emp[n] = e;
        return n+1;
    }


}