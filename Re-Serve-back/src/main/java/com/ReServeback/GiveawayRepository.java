package com.ReServeback;

import com.ReServeback.models.Giveaway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GiveawayRepository extends CrudRepository<Giveaway, Long> {


    List<Giveaway> findByEmailNot(String email);

    List<Giveaway> findByEmail(String email);

    List<Giveaway> findByLocation(String location);


}
