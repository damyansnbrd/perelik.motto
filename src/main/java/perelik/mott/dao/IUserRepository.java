package perelik.mott.dao;

import org.springframework.data.repository.CrudRepository;
import perelik.mott.model.User;


public interface IUserRepository extends CrudRepository<User, Long> {
}
