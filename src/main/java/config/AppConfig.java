package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import impl.ArtistRepositoryImpl;
import interfaces.ArtistRepository;

@Configuration
public class AppConfig {

	@Bean
	ArtistRepository artistRepository(){
		return new ArtistRepositoryImpl();
	}

}
