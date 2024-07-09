package final_keyword;

public class final_method {
    final void run(){
        System.out.println("running");
    }
}

class Honda extends final_method{
  /*  void run(){  --------- cannot be overridden
        System.out.println("running safe");
    }*/
void run(int i){ // can be overloaded
    System.out.println("overloaded: " +i);
}
    public static void main(String[] args){
        Honda h = new Honda();
        h.run();
        h.run(8);
    }
}
