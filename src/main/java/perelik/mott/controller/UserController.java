package perelik.mott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import perelik.mott.model.User;
import perelik.mott.service.IUserService;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class UserController {

    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUser() {
        return userService.listUser();
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public User addUser(@RequestParam(value="name") String name, @RequestParam(value="pass") String pass) {
        User user = new User();
        user.setName(name);
        user.setPassword(pass);
        user.setCreatedOn(LocalDateTime.now());
        userService.addUser(user);
        return user;
    }

}
