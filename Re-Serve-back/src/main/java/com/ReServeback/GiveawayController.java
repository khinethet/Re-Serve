package com.ReServeback;

import com.ReServeback.models.Giveaway;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class GiveawayController {

    private GiveawayService giveawayService;

    @RequestMapping("/hello")
    public String index() { return "Greetings!";}

    @RequestMapping("/{creator}/under_creator")
    public List<Giveaway> byAuthor(@PathVariable(value = "creator") String creator) {
        return giveawayService.byAuthor(creator);
    }

    @RequestMapping("/{creator}/all_giveaways")
    public List<Giveaway> allGiveaways(@PathVariable(value = "creator") String creator) {
        return giveawayService.allGiveaways(creator);
    }

    @RequestMapping("/{location}")
    public List<Giveaway> byLocation(@PathVariable(value = "location") String location) {
        return giveawayService.giveawaysInMyLocation(location);
    }

}

