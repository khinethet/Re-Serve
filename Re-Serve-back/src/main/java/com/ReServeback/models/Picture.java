package com.ReServeback.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Picture {
    @Id
    private String path;
    private int id;

    protected Picture() {}

    public Picture(String path, int id) {
        this.path = path;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "\"path\": \"" + path + "\"," +
                        "\"id\": \"" + id + "\"," +
                "}";
    }
}
