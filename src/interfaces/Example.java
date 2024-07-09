package interfaces;

public class Example {
    public static void main(String[] args){
        //Animal animal = new Animal(); // not allowed - animal.eat() does not have implementation
       // Dog d = new Animal(); // not allowed - child cannot hold parent
        Animal a = new Dog();
        a.eat();
        a.run();
        a.walk();
    }
}


