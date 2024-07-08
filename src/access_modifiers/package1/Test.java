package access_modifiers.package1;

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        //System.out.println(s.name) not accessible from here as it is private
        System.out.println(s.email); // can access because it is default
        System.out.println(s.age); //can access because it is protected
        //System.out.println(s.print()); not accessible as it is private
       // System.out.println(s.cook()); no return type
    }
}