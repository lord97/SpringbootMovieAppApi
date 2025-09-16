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

    @Value("${MONGO_DATABASE}")
    private String mongoDatabaseName;

    @GetMapping("/")
    public String hello(){
        // Retourne la valeur de la variable d'environnement injectée
        return "Nom de la base de données MongoDB : " + mongoDatabaseName;
    }

}
