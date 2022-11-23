package com.tg360.webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class WebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserverApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void readyToStart(ApplicationReadyEvent event){System.out.println("Let's start :: http://localhost:8080");}


}
