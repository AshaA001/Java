package inheritance.example_5;

public class Example {
    public static void main(String[] args) {
        Instructor in = new Instructor("ANB", "a@com", "j");
        System.out.println(in.name);
        System.out.println(in.email);
        System.out.println(in.batch);
    }
}

class User{
    String name;
    String email;
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}

class Instructor extends User{
    String batch;
    public Instructor(String name, String email, String batch){
        super(name, email);
        this.batch = batch;
    }
}
