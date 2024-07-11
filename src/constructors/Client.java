package constructors;

public class Client {
    public static void main(String[] args) {
        //Student s = new Student();
//        Student s1 = new Student(24,"ret");
//        Student s2 = new Student(26,"ret1");
//        System.out.println(s1.name);
//        System.out.println(s2.name);
        Student s = new Student(); // cannot be accessed if its private constructor
        s.setAge(30);
        s.setName("wert");
        System.out.println(s.getAge());
        System.out.println(s.getName());

      //  s.printStudent(s);
      //  System.out.println("After printStudent:" + s.name);

        Student copy = new Student(s);
       // copy.age = s.age; -- not accessible as age is private
      //  System.out.println(copy.age); -- not accessible as age is private
        System.out.println(copy.name);
    }
}
