package com.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoggingShootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingShootApplication.class, args);
		// TRACE < DEBUG < INFO < WARN < ERROR
			log.trace("This is for trace");
			log.debug("This is debug");
			log.info("This is for info");
			log.warn("This is for warn");
			log.error("This is for error");
	}

}
