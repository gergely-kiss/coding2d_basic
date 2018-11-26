package com.coding2d.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAPI {

	private static final Logger LOG = LoggerFactory.getLogger(IndexAPI.class); 
	
	@RequestMapping(value = "/")
	@GetMapping
	public String getIndex() {
		LOG.info("getIndex was called");
		return "index.html";
	}
}
