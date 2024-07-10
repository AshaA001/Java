package constructors.copy;

public class Client5 {
    public static void main(String[] args) {
        Address add = new Address("street1");
        Student s = new Student(24,"abc", add);
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.address.street);

        Student copy = new Student(s);
        s.address.street = "st234";
        System.out.println(copy.age);
        System.out.println(copy.name);
        System.out.println(copy.address.street);
    }
}
