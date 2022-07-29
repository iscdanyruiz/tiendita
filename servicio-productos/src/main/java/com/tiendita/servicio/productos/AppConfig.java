package com.tiendita.servicio.productos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean("clientRest")
	public RestTemplate regirtrarRestTemplate() {
		return new RestTemplate();
	}
}
