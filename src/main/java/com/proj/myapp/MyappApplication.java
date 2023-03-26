package com.proj.myapp;

import com.proj.myapp.config.configpr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
//@EnableConfigurationProperties
public class MyappApplication {
//	@ComponentScan("com.proj")
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
