package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 声明这是一个Eureka的客户端
public class ServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProviderApplication.class, args);
	}

}
