package com.ReServeback;

import com.ReServeback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user")
    public List<User> getAllUsers() {

        Iterable<User> userRepoIterator = userRepository.findAll();
        List<User> users = new ArrayList<>();
        userRepoIterator.forEach(users::add);
        return users;
    } //define in User

    @RequestMapping("/login/{email}")
    public User login(@PathVariable(value = "email") String email) {
        if(userRepository.findById(email).isPresent()) {
            User user = userRepository.findById(email).get();
            return user;
        }
        else {
            return null;
        }
    }

    @RequestMapping("/{email}")
    public User getUser(@PathVariable(value = "email") String email) {
        if(userRepository.findById(email).isPresent()) {
            User user = userRepository.findById(email).get();
            return user;
        }
        else {
            return null;
        }
    }

}
