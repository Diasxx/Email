package com.example.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplication {

	private final EmailSenderService senderService;

	public EmailApplication(EmailSenderService senderService) {
		this.senderService = senderService;
	}


	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@EventListener(ApplicationEvent.class)
	public void sendMail(){
		senderService.sendEmail("rustembekov04@mail.ru","Санжар пидр ","САНЖАР ПИДР!!!");
	}

}
