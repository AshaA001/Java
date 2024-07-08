package access_modifiers.package2;

import access_modifiers.package1.Student;

public class SeniorStudent extends Student {
    void print() {
        System.out.println(age); //protected inheritance, diff package - child can access protected members
        // System.out.println(name); name is private
        //   System.out.println(email); // not in same package -- default won't work in different package
    }
}
