package com.ReServeback;

import com.ReServeback.models.Giveaway;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GiveawayRepository extends CrudRepository<Giveaway, Long> {


    List<Giveaway> findByEmailNot(String email);

    List<Giveaway> findByEmail(String email);

    List<Giveaway> findByLocation(String location);

}
