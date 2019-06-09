package com.ReServeback.models;

import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Joined_User {

    @Id
    private int ju_id;
    @ManyToMany
    @JoinColumn(name = "email")
    private User user;
    private int id;

    protected Joined_User() {}

    public Joined_User(User user, int id,int ju_id) {
        this.user = user;
        this.id = id;
        this.ju_id = ju_id;
    }

    @Override
    public String toString() {
        return
                "{" +
                    "\"email\": \"" + user + "\"," +
                    "\"id\": \"" + id + "\"," +
                "}";
    }
}
