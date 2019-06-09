package com.ReServeback.models;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
public class Giveaway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="email")
    private User creator;

    private String username;
    private String title;
    private String description;
    private String location;
    private int entry_limit;
    private String end_date;

    @OneToOne
    @JoinColumn(name="email", insertable=false, updatable=false)
    private User winner;

    @OneToMany
    @JoinColumn(name="email")
    private List<User> joined_users;

    @OneToMany
    @JoinColumn(name="id")
    private List<Picture> pictures;

    protected Giveaway() {}

    public Giveaway(int id, User creator, String username, String title, String description,
                    String location, int entry_limit, String end_date, User winner) {
        this.id = id;
        this.creator = creator;
        this.username = username;
        this.title = title;
        this.description = description;
        this.location = location;
        this.entry_limit = entry_limit;
        this.end_date = end_date;
        this.winner = winner;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "\"id\": \"" + id + "\"," +
                        "\"creator_email\": \"" + creator.getEmail() + "\"," +
                        "\"username\": \"" + username + "\"," +
                        "\"title\": \"" + title + "\"," +
                        "\"description\": \"" + description + "\"," +
                        "\"location\": \"" + location + "\"," +
                        "\"entry_limit\": \"" + entry_limit + "\"," +
                        "\"end_date\": \"" + end_date + "\"," +
                        "\"winner_email\": \"" + winner.getEmail() + "\"" +
                        "}";
    }
}
