package com.example.age;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class AgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgeApplication.class, args);
	}

    @RequestMapping(value="/age")
	public Age getAge(){
		calculateAge age = new calculateAge();
		log.info("AGE METHOD CALLED");
		return age.getAge(1997,03,06);
	}
}
