package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class GiveawayController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GiveawayRepository giveawayRepository;

    @RequestMapping("/giveaways")
    public List<Giveaway> getAllGiveaways() {
        Iterable<Giveaway> giveawayRepoIterator = giveawayRepository.findAll();
        List<Giveaway> giveaways = new ArrayList<>();
        giveawayRepoIterator.forEach(giveaways::add);
        return giveaways;
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

    @RequestMapping("/{id}/win")
    public User getWinner(@PathVariable(value = "id") long id) {
        Giveaway giveaway = giveawayRepository.findById(id).get();

        if (giveaway.getWinner() == null) {
            System.out.println("null--------------------");
            Set<User> participants = giveaway.getParticipants();
            RandomCollection<User> lottery = new RandomCollection<>();
            for (User user : participants) {
                lottery.add(user.getKarma(), user);
            }
            User winner = lottery.next();
//            userRepository.save(winner);
            giveaway.setWinner(winner);
            giveawayRepository.save(giveaway);
            return winner;
        }
        else {
            return giveaway.getWinner();
        }
    }

    @RequestMapping("/{id}/participants")
    public Set<User> getParticipants(@PathVariable(value = "id") long id) {
        Giveaway giveaway = giveawayRepository.findById(id).get();
        return giveaway.getParticipants();
    }

    @RequestMapping("/{id}/join/{email}")
    public void joinGiveaway(@PathVariable(value = "id") long id,
                                   @PathVariable(value = "email") String email) {
        Giveaway giveaway = giveawayRepository.findById(id).get();
        User participant = userRepository.findById(email).get();
        giveaway.addParticipants(participant);
        giveawayRepository.save(giveaway);
    }

    @RequestMapping("/{id}/leave/{email}")
    public void leaveGiveaway(@PathVariable(value = "id") long id,
                             @PathVariable(value = "email") String email) {
        Giveaway giveaway = giveawayRepository.findById(id).get();
        User participant = userRepository.findById(email).get();
        giveaway.removeParticipants(participant);
        giveawayRepository.save(giveaway);
    }

    @RequestMapping("/{id}/participants/number_of_people")
    public int numParticipants(@PathVariable(value = "id") long id) {
        Giveaway giveaway = giveawayRepository.findById(id).get();
        return giveaway.numParticipants();
    }




    //user joining (email) and giveaway id and this inserts to joined_user table
    //opt out is delete entry joined_users
}

