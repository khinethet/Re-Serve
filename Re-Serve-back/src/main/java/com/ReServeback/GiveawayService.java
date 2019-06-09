package com.ReServeback;

import com.ReServeback.models.Giveaway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GiveawayService {

    private GiveawayRepository giveawayRepository;

    @Autowired
    public GiveawayService(GiveawayRepository giveawayRepository) {
        this.giveawayRepository = giveawayRepository;
    }

    public Iterable<Giveaway> list() {
        return giveawayRepository.findAll();
    }

//    public List<Giveaway> byAuthor(String email) {
//        return giveawayRepository.findByEmail(email);
//    }

//    public List<Giveaway> allGiveaways(String email) {
//        return giveawayRepository.findByEmailNot(email);
//    }

    public List<Giveaway> giveawaysInMyLocation(String location) {
        return giveawayRepository.findByLocation(location);
    }



}


