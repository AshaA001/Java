package constructors;

public class Student {
    private int age;
    String name;

    public Student(){
        this.age = 20;
        this.name = "abc";
    }
//    private Student(){  -- Private constructor
//        this.age = 20;
//        this.name = "abc";
//    }

    Student(int age, String name){
    this.age = age;
    this.name = name;
}
Student(Student s){
        this.age = 50;
        this.name = s.name;
}

    Student getStudent(){
        return new Student(); //private constructor can be accessed only within the class
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printStudent(Student s){
        System.out.println(s.age);
        System.out.println(s.name);
        s.name="klo";
    }

}
