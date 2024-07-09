package interfaces.demo.good_implementation;

import interfaces.demo.User;

public class UserService {
   // static DBOperations db = new MySqlDbOps(); -- change is only here, this also can be avoided by using dependency injection
    static DBOperations db = new MongoDbOps();
    public User saveUser(User u){
        return db.insert(u);
    }
    public User updateUser(int id,User updated){
        return db.update(id, updated);
    }

    public static void main(String[] args){
        db.insert(new User());
        db.update(1,new User());
    }
}
