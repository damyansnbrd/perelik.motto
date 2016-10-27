package perelik.mott.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import perelik.mott.dao.IUserDAO;
import perelik.mott.model.User;

import java.util.List;

//@Service
public class UserServiceImpl implements IUserService {

    private IUserDAO userDAO;

    public void setUserDAO(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User u) {
        this.userDAO.addUser(u);
    }

    @Override
    @Transactional
    public void updateUser(User u) {
        this.userDAO.updateUser(u);
    }

    @Override
    @Transactional
    public List<User> listUser() {
        return this.userDAO.listUser();
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return this.userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUser(long id) {
        this.userDAO.removeUser(id);
    }
}
