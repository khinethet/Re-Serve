package com.ReServeback.models;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Giveaway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="EMAIL", insertable = false, updatable = false)
    private User creator;

//    @Column(name="USERNAME")
//    private String username;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="LOCATION")
    private String location;

    @Column(name="ENTRY_LIMIT")
    private Long entry_limit;

    @Column(name="END_DATE")
    private String end_date;

    @ManyToOne
    private User winner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<User> participants;

//    @OneToMany
//    @JoinColumn(name="id")
//    private List<Picture> pictures;

    public Giveaway() {}

    public Giveaway(User creator, String title, String description,
                    String location, Long entry_limit, String end_date, User winner) {
        this.creator = creator;
//        this.username = username;
        this.title = title;
        this.description = description;
        this.location = location;
        this.entry_limit = entry_limit;
        this.end_date = end_date;
        this.winner = winner;
//        this.participants = participants;
        this.participants = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getEntry_limit() {
        return entry_limit;
    }

    public void setEntry_limit(Long entry_limit) {
        this.entry_limit = entry_limit;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    public void addParticipants(User participant) { this.participants.add(participant); }

    public void removeParticipants(User participant) { this.participants.remove(participant); }

    //    public Set<User> getJoined_users() {
//        return joined_users;
//    }
//
//    public void setJoined_users(Set<User> joined_users) {
//        this.joined_users = joined_users;
//    }

    //    @Override
//    public String toString() {
//        return
//                "{" +
//                        "\"id\": \"" + id + "\"," +
//                        "\"creator_email\": \"" + creator.getEmail() + "\"," +
//                        "\"username\": \"" + username + "\"," +
//                        "\"title\": \"" + title + "\"," +
//                        "\"description\": \"" + description + "\"," +
//                        "\"location\": \"" + location + "\"," +
//                        "\"entry_limit\": \"" + entry_limit + "\"," +
//                        "\"end_date\": \"" + end_date + "\"," +
//                        "\"winner_email\": \"" + winner.getEmail() + "\"" +
//                        "}";
//    }
}
