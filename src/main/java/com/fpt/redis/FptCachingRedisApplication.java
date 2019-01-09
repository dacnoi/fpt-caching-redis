package com.fpt.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FptCachingRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FptCachingRedisApplication.class, args);
	}
}
