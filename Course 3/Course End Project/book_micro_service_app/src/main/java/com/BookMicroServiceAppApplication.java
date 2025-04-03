package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class BookMicroServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMicroServiceAppApplication.class, args);
		System.err.println("booking micro service up on port number 8181");
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		System.out.println("Rest Template object created in BookMicroService Main Class");
		return new RestTemplate();
	}
	
}
