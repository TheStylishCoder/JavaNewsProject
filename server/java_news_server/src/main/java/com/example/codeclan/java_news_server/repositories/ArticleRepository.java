package com.example.codeclan.java_news_server.repositories;

import com.example.codeclan.java_news_server.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findArticlesByCategoryTypeOrderByDateDesc(String category);

}
