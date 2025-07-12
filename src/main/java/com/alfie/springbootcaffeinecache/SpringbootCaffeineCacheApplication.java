package com.alfie.springbootcaffeinecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootCaffeineCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCaffeineCacheApplication.class, args);
	}

}
