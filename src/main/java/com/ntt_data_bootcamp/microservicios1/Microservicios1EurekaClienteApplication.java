package com.ntt_data_bootcamp.microservicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservicios1EurekaClienteApplication {
	
//	@Autowired
//	private DiscoveryClient discoveryClient;
	
	public static void main(String[] args) {
		SpringApplication.run(Microservicios1EurekaClienteApplication.class, args);
	}

}
