package co.kr.sptek.myspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Helloworld new";
	}

}
