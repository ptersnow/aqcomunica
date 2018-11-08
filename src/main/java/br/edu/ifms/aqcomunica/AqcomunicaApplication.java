package br.edu.ifms.aqcomunica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AqcomunicaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AqcomunicaApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AqcomunicaApplication.class, args);
	}
}
