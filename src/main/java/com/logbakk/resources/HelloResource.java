package com.logbakk.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloResource {
	
	
	@GetMapping("/{string}")
	public String print(@PathVariable String string) {
		return string;
	}

}
