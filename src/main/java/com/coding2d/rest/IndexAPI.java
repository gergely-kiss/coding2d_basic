package com.coding2d.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAPI {
	
	@RequestMapping(value = "/")
	@GetMapping
	public String index() {
		return "index.html";
	}
}
