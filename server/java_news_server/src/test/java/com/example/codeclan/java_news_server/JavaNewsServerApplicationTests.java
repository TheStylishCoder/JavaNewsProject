package com.example.codeclan.java_news_server;

import com.example.codeclan.java_news_server.models.Location;
import com.example.codeclan.java_news_server.models.Role;
import com.example.codeclan.java_news_server.models.User;
import com.example.codeclan.java_news_server.repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaNewsServerApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	RoleRepository roleRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateUser(){

		Role admin = new Role("admin");
		roleRepository.save(admin);

		Location scotland = new Location("Scotland");
		locationRepository.save(scotland);

		User user = new User("BobBoberson", "iluvnews", admin, scotland);
		userRepository.save(user);
	}

}
