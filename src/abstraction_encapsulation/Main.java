package abstraction_encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "n1";
        s1.email = "n1@gmail.com";
        s1.age = 25;
        s1.pauseCourse();

        Student s2 = new Student();
        s2.name = "n2";
        s2.changeBatch();
    }

}
