package final_keyword;

public class final_variable {
    final int speedlimit = 80; //final variable
    void run(){
        //speedlimit = 400; //Cannot assign a value to final variable 'speedlimit'
    }

    public static void main(String[] args){
        final_variable obj = new final_variable();
        obj.run();
    }
}
