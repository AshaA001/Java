package inheritance.example_4;

public class Example {
    public static void main(String[] args) {
        C c = new C(new B());
    }
}

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A {
    public B(){
        System.out.println("B");
    }
    public B(String s){
        System.out.println("B " + s);
    }
    public B(B b){
        System.out.println("B copy");
    }
}

class C extends B {
    public C(){
        super();
       // super("Hello"); -- only one super() is allowed
        System.out.println("C");
    }
    public C(B b){
        super(b);
    }
}