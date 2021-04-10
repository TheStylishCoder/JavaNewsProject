package com.example.codeclan.java_news_server.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Role role;

    @ManyToOne
    @JsonIgnoreProperties(value = "users")
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @JsonIgnoreProperties(value = "users")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "articles_users",
            joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)}
    )
    private List<Article> favouriteArticles;

    @JsonIgnoreProperties(value = "users")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "articles_users",
            joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)}
    )
    private List<Article> viewedArticles;


    public User(String username, String password, Role role, Location location) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.location = location;
        this.favouriteArticles = new ArrayList<>();
        this.viewedArticles = new ArrayList<>();
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Article> getFavouriteArticles() {
        return favouriteArticles;
    }

    public void setFavouriteArticles(List<Article> favouriteArticles) {
        this.favouriteArticles = favouriteArticles;
    }

    public List<Article> getViewedArticles() {
        return viewedArticles;
    }

    public void setViewedArticles(List<Article> viewedArticles) {
        this.viewedArticles = viewedArticles;
    }
}
