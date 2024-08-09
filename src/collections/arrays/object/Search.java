package collections.arrays.object;

import java.util.Date;

public class Search {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        Employee[] emp= new Employee[10];
        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;

        int n =6;
        Employee key = emp2;

        int pos = search(emp,n,key);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }

    private static int search(Employee[] emp, int n, Employee key) {
        for(int i =0; i<n; i++){
            if(emp[i].equals(key)){
                return i;
            }
        }

        return -1;
    }
}
