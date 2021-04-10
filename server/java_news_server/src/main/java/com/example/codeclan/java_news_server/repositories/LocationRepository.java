package com.example.codeclan.java_news_server.repositories;

import com.example.codeclan.java_news_server.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
