package com.microserviceitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceItemApplication.class, args);
	}

}
