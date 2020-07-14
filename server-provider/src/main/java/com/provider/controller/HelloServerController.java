package com.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServerController {

	@RequestMapping(value = "helloServer", method = RequestMethod.GET, produces = "application/json;charser=utf-8")
	public String helloServerController() {
		return "Hello World!";
	}
}
