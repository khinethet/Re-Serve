package com.ReServeback;

import com.ReServeback.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {

//    List<User> findByEmail(String email);
}
