package final_keyword;

public class final_variable {

    // final int xyz= 90; -- cannot be changed even in constructor
    final int speedlimit; //final variable - forced to initialize in constructor, once initialized, value cannot be changed

    public final_variable(){
        speedlimit = 80;
    }

    public final_variable(int speedlimit){
        this.speedlimit = speedlimit;
    }

    void run(){
        //speedlimit = 400; //Cannot assign a value to final variable 'speedlimit'
    }

   // public static final double PI = 3.14;
    public static double PI = 3.14;
    public static void main(String[] args){
        final_variable obj = new final_variable();
        obj.run();

        final String s="Hello";
        System.out.println(s);
       // s="Hi"; -- Cannot assign a value to final variable 's'

        PI = 2.56;
        System.out.println(PI);
    }
}
