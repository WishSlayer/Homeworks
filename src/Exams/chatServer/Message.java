package Exams.chatServer;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private LocalDateTime messageDateTimeSend;
    private String messageSender;
    private String messageText;

    public Message(String messageSender, String messageText) {
        this.messageSender = messageSender;
        this.messageText = messageText;
    }

    public LocalDateTime getMessageDateTimeSend() {
        return messageDateTimeSend;
    }

    public void setMessageDateTimeSend() {
        this.messageDateTimeSend = LocalDateTime.now();
    }

    public String getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public static Message getMessage(String messageSender, String messageText) {
        return new Message(messageSender, messageText);
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageDateTimeSend=" + messageDateTimeSend +
                ", messageSender=" + messageSender +
                ", messageText='" + messageText + '\'' +
                '}';
    }
}
