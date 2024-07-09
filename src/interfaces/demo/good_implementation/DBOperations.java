package interfaces.demo.good_implementation;

import interfaces.demo.User;

public interface DBOperations {
    User insert(User user);
    User update(int id, User user);
}
