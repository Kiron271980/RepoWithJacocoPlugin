package com.TestJacocoplugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.*.*")
public class TestJacocopluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJacocopluginApplication.class, args);
	}
}
