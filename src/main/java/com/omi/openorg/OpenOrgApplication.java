package com.omi.openorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.omi.openorg")
@SpringBootApplication
public class OpenOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenOrgApplication.class, args);
	}

}
