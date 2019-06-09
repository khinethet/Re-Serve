package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GiveawayRepository extends CrudRepository<Giveaway, Long> {


//    List<Giveaway> findByUserNot(User user);
//
//    List<Giveaway> findByUser(User user);

    List<Giveaway> findByLocation(String location);

}
