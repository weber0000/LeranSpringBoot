package com.example.training02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigBean.class)
public class Training02Application {

	public static void main(String[] args) {
		SpringApplication.run(Training02Application.class, args);
	}
}
