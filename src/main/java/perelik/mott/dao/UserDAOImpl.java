package perelik.mott.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import perelik.mott.model.User;

import java.util.List;

@Repository
@Scope("singleton")
public class UserDAOImpl implements IUserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
        logger.info("new user added: " + u.getName());
    }

    @Override
    public void updateUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(u);
        logger.info("user updated: " + u.getName());
    }

    @Override
    public List<User> listUser() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> users = session.createCriteria(User.class).list();
        if (users != null && users.size() > 0)
            logger.info("user list called");
        return users;
    }

    @Override
    public User getUserById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = session.load(User.class, new Long(id));
        logger.info("User loaded successfully, Person details="+user);
        return user;
    }

    @Override
    public void removeUser(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = session.load(User.class, new Long(id));
        if(null != user){
            session.delete(user);
        }
        logger.info("User deleted successfully, person details="+user);
    }
}
