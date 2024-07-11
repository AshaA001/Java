package inheritance.example_2;

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
      //  private B(){
      //      System.out.println("B");
      //  }
    }

    class C extends B {
        public C(){// compile time error -- parent has private constuctor -- There is no parameterless constructor available in 'inheritance.example_2.B'
            System.out.println("C");
        }
}
