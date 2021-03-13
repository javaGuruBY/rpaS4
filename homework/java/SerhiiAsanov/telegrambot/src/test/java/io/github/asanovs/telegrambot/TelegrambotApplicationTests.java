package io.github.asanovs.telegrambot;

import io.github.asanovs.telegrambot.config.Mapper;
import io.github.asanovs.telegrambot.service.MessageService;
import io.github.asanovs.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
