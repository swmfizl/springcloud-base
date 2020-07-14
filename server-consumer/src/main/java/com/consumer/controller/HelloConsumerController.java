package com.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloConsumerController {

	@RequestMapping(value = "hello", method = RequestMethod.GET, produces = "application/json;charser=utf-8")
	public String helloController() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8081/helloServer", String.class);
	}
}
