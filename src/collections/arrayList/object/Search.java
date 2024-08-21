package collections.arrayList.object;

import java.util.ArrayList;
import java.util.Date;

public class Search {
    public static void main(String[] args){
        Employee emp1 = new Employee("James", 40, "Address1", new Date(2017,04,05));
        Employee emp2 = new Employee("Katie", 25, "Address2", new Date(2022,01,24));
        Employee emp3 = new Employee("Cathy", 32, "Address3", new Date(2015,01,14));

        ArrayList<Employee> arrList = new ArrayList<Employee>();
        arrList.add(emp1);
        arrList.add(emp2);
        arrList.add(emp3);

        int pos = arrList.indexOf(emp2);

        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (pos+1));
        }
    }
}
