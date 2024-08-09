package collections.arrays.object;

import java.util.Date;

public class Deletion {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Employee[] emp= new Employee[10];
        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;

        int n =3;
        int capacity = emp.length;
        Employee key = emp1;

        System.out.println("Before deletion: ");

        for(int i = 0; i<n; i++)
        {
            System.out.println("Name: " + emp[i].name);
            System.out.println("Age: " + emp[i].age);
            System.out.println("Address: " + emp[i].address);
            System.out.println("Joining Date: " + emp[i].joiningDate);
            System.out.println("\n");
        }

        n = delete(emp, n, key);

        System.out.println("After deletion: ");

        for(int i = 0; i<n; i++)
        {
            System.out.println("Name: " + emp[i].name);
            System.out.println("Age: " + emp[i].age);
            System.out.println("Address: " + emp[i].address);
            System.out.println("Joining Date: " + emp[i].joiningDate);
            System.out.println("\n");
        }
    }

    private static int delete(Employee[] emp, int n, Employee key) {
        int pos = findElement(emp, n, key);
        if(pos==-1){
            System.out.println("Element not found");
            return n;
        }
        //Deleting element
        for(int i =pos; i <n-1 ; i++){
            emp[i] = emp[i+1];
        }
        return n-1;
    }

    private static int findElement(Employee[] emp, int n, Employee key) {
        for(int i =0; i<n; i++){
            if(emp[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

}
