package de.tekup.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestLoanEligAConsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestLoanEligAConsApplication.class, args);
	}

}
