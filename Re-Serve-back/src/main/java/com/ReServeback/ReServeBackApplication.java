package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.stream.Stream;

@SpringBootApplication
public class ReServeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServeBackApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository userRepository, GiveawayRepository giveawayRepository) {
		return args -> {
			Stream.of("Matt", "Khine", "Andrew", "Vincent", "Jeremy").forEach(name -> {
				User user = new User(name + "@gmail.com", name, "pass", Long.valueOf(0));
				userRepository.save(user);
			});
			User creator1 = new User("Kevin@gmail.com", "Kevin", "pass", Long.valueOf(0));
			User winner1 = new User("Brandon@gmail.com", "Brandon", "pass", Long.valueOf(0));
			creator1 = userRepository.save(creator1);
			winner1 = userRepository.save(winner1);
			HashSet<User> participants = new HashSet<>();
			participants.add(creator1);
			participants.add(winner1);
			Giveaway giveaway1 = new Giveaway(creator1, "Title", "Description", "Location", Long.valueOf(5), "END_DATE", winner1);
			giveaway1 = giveawayRepository.save(giveaway1);
			giveaway1.getParticipants().add(creator1);
			giveaway1.getParticipants().add(winner1);
			giveawayRepository.save(giveaway1);

			User creator2 = new User("Ana@gmail.com", "Ana", "pass", Long.valueOf(0));
			User winner2 = new User("Vivian@gmail.com", "Vivian", "pass", Long.valueOf(0));
			creator2 = userRepository.save(creator2);
			winner2 = userRepository.save(winner2);
			Giveaway giveaway2 = new Giveaway(creator2, "Title", "Description", "Location", Long.valueOf(5), "END_DATE", winner2);
			giveaway2 = giveawayRepository.save(giveaway2);
			giveaway2.getParticipants().add(creator1);
			giveaway2.getParticipants().add(winner1);
			giveawayRepository.save(giveaway2);
//			userRepository.findAll().forEach(System.out::println);
		};

	}

}
