package io.pivotal.configclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientDemoApplication.class, args);
	}

	@Value("${cloudPropertyKey}")
	private String property;

	@GetMapping("/")
	public String cloudProvidedProperty() {
		return "The property served up by my jdbc backed config server is : " + property;
	}
}
