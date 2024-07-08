package access_modifiers.package2;

import access_modifiers.package1.Student;

public class Animal {
    public static void main(String[] args){
        Student s = new Student();
      //  System.out.println(s.email); //email' is not public in 'access_modifiers.package1.Student'. Cannot be accessed from outside package
      //  System.out.println(s.age); // age has protected access
    }
}
