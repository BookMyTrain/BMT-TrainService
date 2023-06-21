package com.trainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrainserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainserviceApplication.class, args);
	}

}
