package com.back_end_transportadora_zeus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableScheduling
public class BackEndTransportadoraZeusApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndTransportadoraZeusApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins(new String[] { "*" })
						.allowedMethods(new String[] { "GET", "POST", "PUT", "DELETE" });
			}
		};
	}

}
