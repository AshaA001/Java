package final_keyword;

public class final_method_inherited {
    final void run(){
        System.out.println("Running Safe");
    }
}

class Honda2 extends final_method_inherited{
    public static void main(String[] args){
        new Honda2().run();
    }
}