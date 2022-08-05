package com.tiendita.servicio.categorias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioCategoriasApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ServicioCategoriasApplication.class, args);
	}

}
