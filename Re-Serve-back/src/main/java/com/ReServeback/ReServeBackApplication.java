package com.ReServeback;

import com.ReServeback.models.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ReServeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServeBackApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository repository) {
		return args -> {
			Stream.of("Matt", "Khine", "Andrew", "Vincent", "Jeremy").forEach(name -> {
				User user = new User(name + "@gmail.com", name, "pass", 0);
				repository.save(user);
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
