//package com.ReServeback.models;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Joined_User {
//
//    @Id
//    private int ju_id;
//
//    @ManyToMany
//    @JoinColumn(name = "email")
//    private User user;
//
//    @ManyToMany
//    @JoinColumn(name = "id")
//    private Giveaway giveaway;
//
//    protected Joined_User() {}
//
//    public Joined_User(User user, Giveaway giveaway, int ju_id) {
//        this.user = user;
//        this.giveaway = giveaway;
//        this.ju_id = ju_id;
//    }
//
//    @Override
//    public String toString() {
//        return
//                "{" +
//                    "\"email\": \"" + user.getEmail() + "\"," +
//                    "\"id\": \"" + giveaway.getId() + "\"," +
//                "}";
//    }
//}
