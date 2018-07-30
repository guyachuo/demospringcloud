package com.example.demospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*(exclude= {DataSourceAutoConfiguration.class})*/
public class DemospringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringcloudApplication.class, args);
	}
}
