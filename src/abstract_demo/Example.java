package abstract_demo;

public class Example{
    public static void main(String[] args){
        //Animal a = new Animal(); -- not allowed as Animal is abstract class
        Animal a = new Dog();
        a.walk();
       // ABC abc = new ABC(); -- not allowed as ABC is abstract class
    }
}
abstract class Animal {
    String name;
    int age;
    public void printName(){
        System.out.println(name);
    }
    abstract void walk();
}

class Dog extends Animal{
    String breed;
    @Override
    void walk() {
        System.out.println("Dog is walking");
    }
}

abstract class ABC{ // abstract class with 0 abstract methods
    String a;
    int b;
}
