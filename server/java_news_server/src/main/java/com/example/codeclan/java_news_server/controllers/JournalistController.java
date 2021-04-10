package com.example.codeclan.java_news_server.controllers;

import com.example.codeclan.java_news_server.models.Journalist;
import com.example.codeclan.java_news_server.repositories.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @GetMapping(value="/journalists")
    public ResponseEntity<List<Journalist>> getAllJournalists(){
        return new ResponseEntity<>(journalistRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/journalists/{id}")
    public ResponseEntity getJournalist(@PathVariable Long id){
        return new ResponseEntity<>(journalistRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/journalists")
    public ResponseEntity<Journalist> postJournalist(@RequestBody Journalist journalist){
        journalistRepository.save(journalist);
        return new ResponseEntity<>(journalist, HttpStatus.CREATED);
    }

    @PatchMapping(value="/journalists/{id}")
    public ResponseEntity<Journalist> updateJournalist(@RequestBody Journalist journalist){
        journalistRepository.save(journalist);
        return new ResponseEntity<>(journalist, HttpStatus.OK);
    }

    @DeleteMapping(value="/journalists/{id}")
    public ResponseEntity<Journalist> deleteJournalist(@PathVariable Long id){
        Journalist found = journalistRepository.getOne(id);
        journalistRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
