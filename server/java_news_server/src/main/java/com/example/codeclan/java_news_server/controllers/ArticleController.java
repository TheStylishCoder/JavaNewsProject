package com.example.codeclan.java_news_server.controllers;


import com.example.codeclan.java_news_server.models.Article;
import com.example.codeclan.java_news_server.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value="/articles")
    public ResponseEntity<List<Article>> getAllArticles(){
        return new ResponseEntity<>(articleRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/articles/{id}")
    public ResponseEntity getArticle(@PathVariable Long id){
        return new ResponseEntity<>(articleRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/articles")
    public ResponseEntity<Article> postArticle(@RequestBody Article article){
        articleRepository.save(article);
        return new ResponseEntity<>(article, HttpStatus.CREATED);
    }

    @PatchMapping(value="/articles/{id}")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        articleRepository.save(article);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @DeleteMapping(value="/articles/{id}")
    public ResponseEntity<Article> deleteArticle(@PathVariable Long id){
        Article found = articleRepository.getOne(id);
        articleRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

//    http://localhost:8080/api/articles/category?category=Business an example search
    @GetMapping(value="/articles/category")
    public ResponseEntity<List<Article>> getAllArticlesByCategory(@RequestParam(name="category") String category){
        return new ResponseEntity<List<Article>>(articleRepository.findArticlesByCategoryType(category), HttpStatus.OK);
    }
}

