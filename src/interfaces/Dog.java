package interfaces;

public class Dog implements Animal{
        @Override
        public void eat() { //method's access modifier is public because in interface it is public, we cannot restrict to default by not adding any access modifier
            System.out.println("Dog is eating");
        }

        @Override
        public void walk() {
            System.out.println("Dog is walking");
        }

        @Override
        public void run() {
            System.out.println("Dog is running");
        }
}
