package polymorphism.run_time;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
//        List<User> users = getUsers();
//        for(User u: users){
//            u.login();
//        }

       // User user = new Instructor();
       // user.login();

        User user = getUser();
        user.login();
    }

    private static User getUser(){
        Random random = new Random();
            int num = random.nextInt();
            if(num%2==0){
                return new Instructor();
            }else{
                return new Mentor();
            }
    }

    private static List<User> getUsers(){
        Random random = new Random();
        List<User> users = new ArrayList<>();
       for(int i =0; i<10; i++) {
           int num = random.nextInt();
           if(num%2==0){
               users.add(new Instructor());
           }else{
               users.add(new Mentor());
           }
       }
        return users;
    }
}
class User{
    void login(){
        System.out.println("User is logging in!");
    }
}

class Instructor extends User{
//    void login(){
//        System.out.println("Instructor is logging in!");
//    }
}

class Mentor extends User{
    void login(){
        System.out.println("Mentor is logging in!");
    }
}
