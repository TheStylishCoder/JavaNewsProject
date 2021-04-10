package com.example.codeclan.java_news_server.repositories;

import com.example.codeclan.java_news_server.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
