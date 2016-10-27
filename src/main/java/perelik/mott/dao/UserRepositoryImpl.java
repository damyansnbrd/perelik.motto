package perelik.mott.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserRepositoryImpl implements IUserRepository{

    @Autowired
    private IUserRepository userRepository;
}
