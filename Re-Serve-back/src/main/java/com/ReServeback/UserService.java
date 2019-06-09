package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public List<User> byAuthor(String email) {
        return userRepository.findByEmail(email);
    }
}
