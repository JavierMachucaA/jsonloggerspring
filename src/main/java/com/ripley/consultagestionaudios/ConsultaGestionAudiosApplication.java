package com.ripley.consultagestionaudios;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
public class ConsultaGestionAudiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaGestionAudiosApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		System.out.println("In CommandLineRunnerImpl ");
		log.info("Test info");
		log.warn("Test warn");
		log.error("Test error");
		log.trace("Test trace");

	}
}
