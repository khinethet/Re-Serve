package com.ReServeback.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Picture {
    @Id
    private String path;
    @OneToMany
    @JoinColumn(name = "id")
    private Giveaway giveaway;

    protected Picture() {}

    public Picture(String path, Giveaway giveaway) {
        this.path = path;
        this.giveaway = giveaway;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "\"path\": \"" + path + "\"," +
                        "\"id\": \"" + giveaway.getId() + "\"," +
                "}";
    }
}
