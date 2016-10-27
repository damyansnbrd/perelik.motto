package perelik.mott.service;

import perelik.mott.model.User;
import java.util.List;

public interface IUserService {

    void addUser(User u);
    void updateUser(User u);
    List<User> listUser();
    User getUserById(long id);
    void removeUser(long id);
}
