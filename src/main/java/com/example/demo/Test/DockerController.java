package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Docker")
public class DockerController {
	
	@Autowired
	DockerService dockerService;
	
	@RequestMapping("/Test")
	public String MockTest() {
		String val;
		val=dockerService.returnVal();
		return val;
	}

}
