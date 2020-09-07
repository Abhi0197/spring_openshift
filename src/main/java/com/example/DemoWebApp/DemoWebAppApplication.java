package com.example.DemoWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
@SpringBootApplication
public class DemoWebAppApplication {


	@GetMapping("/")
	public String welcome()
	{
		return "Hello World in Lockdown";
	}
	@GetMapping("/{input}")
	public String welcome1(@PathVariable String input)
	{
		return "Hello"+input;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoWebAppApplication.class, args);
	}

}
