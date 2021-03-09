package io.flashsuppressor.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.*;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(TelegrambotApplication.class, args);
	}
}
