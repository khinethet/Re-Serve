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
        ArrayList<User> list = new ArrayList<>();
        list = (ArrayList) userRepository.findAll();
        return list;
    }
}
