package io.github.asanovs.telegrambot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.asanovs.telegrambot.config.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class})
class TelegramBotTest {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;

//    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBot.onUpdateReceived(update);
    }

//    @Test
    void sendMessage() throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(322152117L);
        sendMessage.setText("Hello I'm bot Serhii Asanov");
        telegramBot.execute(sendMessage);
    }
}