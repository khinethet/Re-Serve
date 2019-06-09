package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GiveawayController {

    @Autowired
    private GiveawayRepository giveawayRepository;

    @RequestMapping("/giveaways")
    public List<Giveaway> getAllGiveawayss() {
        ArrayList<Giveaway> list = new ArrayList<>();
        list = (ArrayList) giveawayRepository.findAll();
        return list;
    }

//    @RequestMapping("/hello")
//    public String index() { return "Greetings!";}

//    @RequestMapping("/{creator}/under_creator")
//    public List<Giveaway> byAuthor(@PathVariable(value = "creator") String creator) {
//        return giveawayService.byAuthor(creator);
//    }
//
//    @RequestMapping("/{creator}/all_giveaways")
//    public List<Giveaway> allGiveaways(@PathVariable(value = "creator") String creator) {
//        return giveawayService.allGiveaways(creator);
//    }

//    @RequestMapping("/{location}")
//    public List<Giveaway> byLocation(@PathVariable(value = "location") String location) {
//        return giveawayService.giveawaysInMyLocation(location);
//    }
//
//    @RequestMapping("/{current_user}")
//    public List<User> profile(@PathVariable(value = "current_user") String current_user) {
//        return userService.byAuthor(current_user);
//    }



    //user joining (email) and giveaway id and this inserts to joined_user table
    //opt out is delete entry joined_users
}

