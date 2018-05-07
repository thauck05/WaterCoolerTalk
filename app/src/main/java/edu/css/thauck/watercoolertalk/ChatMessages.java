package edu.css.thauck.watercoolertalk;

import java.util.Date;

public class ChatMessages {
    private String messageText;
    private String messageAuthor;
    private long messageTime;

    public ChatMessages(String messageText, String messageAuthor) {
        this.messageText = messageText;
        this.messageAuthor = messageAuthor;
        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessages() {

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
