package interfaces.demo.library;

import interfaces.demo.User;

public class MySqlDriver {
    public void insert(User u){
        System.out.println("Inserting user into MySql DB");
    }
    public void update(int id, User updated){
        System.out.println("Updating user with id: " +id);
    }
}
