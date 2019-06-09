package com.ReServeback.models;

import com.ReServeback.GiveawayRepository;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @Column(name="EMAIL")
    private String email;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="KARMA")
    private Long karma;

    @ManyToMany(mappedBy="participants")
    private Set<Giveaway> participants;

    protected User() {}

    public User(String email, String username, String password) {
//        this(email, username, password, Long.valueOf(0));
        this.email = email;
        this.username = username;
        this.password = password;
        this.karma = Long.valueOf(0);
    }

    public User(String email, String username, String password, Long karma) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.karma = karma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getKarma() {
        return karma;
    }

    public void setKarma(Long karma) {
        this.karma = karma;
    }



    //    @Override
//    public String toString() {
//        return
//                "{" +
//                    "\"email\": \"" + email + "\"," +
//                    "\"username\": \"" + username + "\"," +
//                    "\"karma\": \"" + karma + "\"" +
//                "}";
//    }
}
