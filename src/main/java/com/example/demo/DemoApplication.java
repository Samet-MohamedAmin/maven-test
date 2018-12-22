package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.apache.log4j.Logger;


@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	final static Logger logger = Logger.getLogger(DemoApplication.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

	public static void main(String[] args) {

		logger.info("It's OK !");
		SpringApplication.run(DemoApplication.class, args);
	}
}


