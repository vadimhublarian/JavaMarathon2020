package day13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vadim Khublarian on 12/14/20.
 */
public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message newMessage = new Message(u1, u2, text);
        messages.add(newMessage);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)) {
                System.out.println(u1.getUsername() + ": " + message.getText());
            }

            if (message.getReceiver().equals(u1) && message.getSender().equals(u2)) {
                System.out.println(u2.getUsername() + ": " + message.getText());
            }
        }
    }
}
