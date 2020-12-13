package day13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vadim Khublarian on 12/13/20.
 */
public class User {
    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.subscriptions.contains(user) && user.subscriptions.contains(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
