package io.github.asanovs.telegrambot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {

    public SendMessage onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        if (update != null) {
            Message message = update.getMessage();
            sendMessage.setChatId(message.getChatId());
            if (message != null && message.hasText()) {
                String mesText = message.getText();
                if (mesText.equals("/start")) {
                    return sendMessage.setText("Start!");
                } else if (mesText.equals("/help")) {
                    return sendMessage.setText("Help!");
                } else if (mesText.equals("/settings")) {
                    return sendMessage.setText("Settings!");
                }
            }
        }
        return sendMessage.setText("Do no!");
    }

}
