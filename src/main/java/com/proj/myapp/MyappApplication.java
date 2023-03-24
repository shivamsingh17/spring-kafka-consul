package com.proj.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class MyappApplication {
//	@ComponentScan("com.proj")
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
