package com.ReServeback.models;

import javax.persistence.*;

@Entity
public class Giveaway {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    @JoinColumn(name="email")
    private User creator;
    private String username;
    private String title;
    private String description;
    private String location;
    private int entry_limit;
    private String end_date;
    @OneToMany
    @JoinColumn(name="email")
    private User winner;

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
