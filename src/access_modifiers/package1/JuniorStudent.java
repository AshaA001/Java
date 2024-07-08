package access_modifiers.package1;

public class JuniorStudent extends Student{
    void print(){
        System.out.println(age); //protected inheritance
        // System.out.println(name); name is private
        System.out.println(email); // same package -- inheritance, default
    }
}
