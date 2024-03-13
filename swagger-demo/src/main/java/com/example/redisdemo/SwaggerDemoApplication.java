package com.example.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2		//开启默认配置的swagger
public class SwaggerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}
}
