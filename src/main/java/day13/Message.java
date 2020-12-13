package day13;

import java.util.Date;

/**
 * Created by Vadim Khublarian on 12/14/20.
 */
public class Message {
    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = java.util.Calendar.getInstance().getTime();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "\n" +
                "FROM: " + sender + "\n" +
                "TO: " + receiver + "\n" +
                "ON: " + date + "\n" +
                text;
    }
}
