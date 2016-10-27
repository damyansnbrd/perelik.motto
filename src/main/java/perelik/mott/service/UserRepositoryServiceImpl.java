package perelik.mott.service;

import org.springframework.stereotype.Service;
import perelik.mott.dao.IUserRepository;
import perelik.mott.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepositoryServiceImpl implements IUserService {

    private IUserRepository userRepository;

    public void setUserRepository(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User u) {
        userRepository.save(u);
    }

    @Override
    public void updateUser(User u) {
        userRepository.save(u);
    }

    @Override
    public List<User> listUser() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void removeUser(long id) {
        userRepository.delete(id);
    }
}
