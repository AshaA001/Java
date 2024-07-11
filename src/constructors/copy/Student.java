package constructors.copy;

public class Student {
    int age;
    String name;
    Address address;

    public Student(int age, String name, Address address) {
        this.age = age;
        this.name=name;
        this.address = address;
    }

    public Student(Student s){
        this.age=s.age;
        this.name=s.name;
       // this.address=s.address; //shallow copy - both constructors are affected when data is changed
        this.address = new Address(s.address.street); //deep copy - only one constructor is affected as new address is created
    }
}