package com.hdw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@EnableCaching
@EnableRedisHttpSession
@SpringBootApplication
public class SessionredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionredisApplication.class, args);
	}
}
