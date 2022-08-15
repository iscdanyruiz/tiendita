package com.tiendita.servicio.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioClientesApplication.class, args);
	}

}
