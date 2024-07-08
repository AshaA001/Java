package static_keyword;

import java.util.Date;

public class Example {
    public static void main(String[] args){
        System.out.println(A.b);
        A.b =1;
        A obj = new A();
        obj.a =1;
        System.out.println(obj.b);
        obj.print();
        A.print();

        DateUtils.printDate(new Date());
    }
}

class A{
    static{  //static block is executed as soon as the class is loaded
        b=1;
        System.out.println("Static Block Complete");
    }
    int a;
    static int b;
  //  static method is stored in class level
    static void print(){
        System.out.println("print");
      //  System.out.println(a); //a is instance level attribute, it does not know which a
        System.out.println(b);
    }

    void doSomething(){
        System.out.println(a);
        System.out.println(b);
    }
}

class DateUtils{
    //utility methods are generally marked static
    public static void printDate(Date d){
        System.out.println(d);
    }

    public static void manifulateDate(Date d){

    }
}
