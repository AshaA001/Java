package inheritance.example_3;

public class Example {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A {
    public B(String s){
        System.out.println("B " + s);
    }
}

class C extends B {
    public C(){
        super("Hello");
        System.out.println("C");
    }
}
