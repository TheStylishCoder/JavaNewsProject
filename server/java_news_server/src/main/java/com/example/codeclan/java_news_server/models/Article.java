package com.example.codeclan.java_news_server.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "headline")
    private String headline;

    @Column(name = "summary")
    private String summary;

    @Column(name = "full_story", length=7000)
    private String fullStory;

    @ManyToOne
    @JsonIgnoreProperties(value = "articles")
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;

    @ManyToOne
    @JsonIgnoreProperties(value = "articles")
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @JsonIgnoreProperties(value = "articles")
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @JsonFormat(pattern ="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Calendar date;

    @Column(name = "view_count")
    private int viewCount;

    @Column(name = "favourite")
    private boolean favourite;

    @JsonIgnoreProperties(value = "articles")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)}
    )
    private List<User> favouritedBy;

    @JsonIgnoreProperties(value = "articles")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)}
    )
    private List <User> viewedBy;

    @Column(name = "image")
    private String image;

    public Article(String headline, String summary, String fullStory, Journalist journalist, Category category,
                   Location location, Calendar date, int viewCount, String image) {
        this.headline = headline;
        this.summary = summary;
        this.fullStory = fullStory;
        this.journalist = journalist;
        this.category = category;
        this.location = location;
        this.date = date;
        this.viewCount = viewCount;
        this.favourite = false;
        this.favouritedBy = new ArrayList<>();
        this.viewedBy = new ArrayList<>();
        this.image = image;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFullStory() {
        return fullStory;
    }

    public void setFullStory(String fullStory) {
        this.fullStory = fullStory;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public List<User> getFavouritedBy() {
        return favouritedBy;
    }

    public void setFavouritedBy(List<User> favouritedBy) {
        this.favouritedBy = favouritedBy;
    }

    public List<User> getViewedBy() {
        return viewedBy;
    }

    public void setViewedBy(List<User> viewedBy) {
        this.viewedBy = viewedBy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

