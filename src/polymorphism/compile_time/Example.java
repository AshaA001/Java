package polymorphism.compile_time;

public class Example {
    void print(){
        System.out.println("hello");
    }

    void print(String name){
        System.out.println("hello " +name);
    }
}

class client{
    public static void main(String[] args) {
        Example e = new Example();
        e.print();
        e.print("Beautiiful");
    }
}
