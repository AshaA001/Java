package access_modifiers.package1;

public class Student {

    private String name;
    String email;
    protected int age;
    public boolean b;

    private void print(){
        System.out.println(this.name);
    }

    void cook(){
        print();
    }
}
