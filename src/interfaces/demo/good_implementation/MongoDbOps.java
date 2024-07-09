package interfaces.demo.good_implementation;

import interfaces.demo.User;
import interfaces.demo.library.MongoDriver;
import interfaces.demo.library.MySqlDriver;

public class MongoDbOps implements DBOperations{

    MongoDriver db = new MongoDriver();

    @Override
    public User insert(User user) {
        db.save(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        db.update(id, user, false);
        return user;
    }
}
