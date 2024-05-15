package org.aadi.videocall;

import org.aadi.videocall.model.User;
import org.aadi.videocall.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Aadi")
							.email("aadi@mail.com")
							.password("xyz")
					.build());

			service.register(User.builder()
					.username("Santosh")
					.email("santosh@mail.com")
					.password("xyz")
					.build());

			service.register(User.builder()
					.username("Sameer")
					.email("sameer@mail.com")
					.password("xyz")
					.build());
		};
	}

}
