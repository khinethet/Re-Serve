package com.ReServeback.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private String email;
    private String username;
    private String password;
    private int karma;

    @OneToMany
    @JoinColumn(name="id")
    private List<Giveaway> joined_giveaways;

    protected User() {}

    public User(String email, String username, String password) {
        this(email, username, password, 0);
    }

    public User(String email, String username, String password, int karma) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.karma = karma;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return
                "{" +
                    "\"email\": \"" + email + "\"," +
                    "\"username\": \"" + username + "\"," +
                    "\"karma\": \"" + karma + "\"" +
                "}";
    }
}
