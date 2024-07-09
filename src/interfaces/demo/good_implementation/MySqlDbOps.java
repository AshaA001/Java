package interfaces.demo.good_implementation;

import interfaces.demo.User;
import interfaces.demo.library.MySqlDriver;

public class MySqlDbOps implements DBOperations{

    MySqlDriver db = new MySqlDriver();

    @Override
    public User insert(User user) {
        db.insert(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        db.update(id, user);
        return user;
    }
}
