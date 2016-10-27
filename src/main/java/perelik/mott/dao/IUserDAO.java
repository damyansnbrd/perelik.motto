package perelik.mott.dao;

import perelik.mott.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IUserDAO {

    void addUser(User u);
    void updateUser(User u);
    List<User> listUser();
    User getUserById(long id);
    void removeUser(long id);
}
