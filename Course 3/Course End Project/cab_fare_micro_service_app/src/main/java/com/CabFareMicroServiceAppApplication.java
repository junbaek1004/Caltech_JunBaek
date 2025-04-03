package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	//@RestController, @Service @Repository enabled
@EntityScan(basePackages = "com.bean") 		//enable @Entity
@EnableJpaRepositories(basePackages = "com.repository") //enable jpa repository features
@EnableDiscoveryClient			// deploy on micro service ie eureka server
public class CabFareMicroServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabFareMicroServiceAppApplication.class, args);
		System.err.println("CabFare micro service running on port number 8282");
	}

}
