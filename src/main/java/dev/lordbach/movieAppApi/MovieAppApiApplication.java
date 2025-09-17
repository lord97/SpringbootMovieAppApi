package dev.lordbach.movieAppApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MovieAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApiApplication.class, args);
	}



}
