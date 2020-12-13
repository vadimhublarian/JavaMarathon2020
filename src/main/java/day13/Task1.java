package day13;

public class Task1 {
    public static void main(String[] args) {
        User someuser1 = new User("someuser1");
        User someuser2 = new User("someuser2");
        User someuser3 = new User("someuser3");

        someuser1.sendMessage(someuser2, "Привет!");
        someuser1.sendMessage(someuser2, "Как дела?");

        someuser2.sendMessage(someuser1, "Ха!");
        someuser2.sendMessage(someuser1, "Привет, " + someuser1.getUsername());
        someuser2.sendMessage(someuser1, "У меня все хорошо");

        someuser3.sendMessage(someuser1, "Привет!");
        someuser3.sendMessage(someuser1, "Ау!");
        someuser3.sendMessage(someuser1, "Как тебя зовут?");

        someuser1.sendMessage(someuser3, "Привет!");
        someuser1.sendMessage(someuser3, "Да-да, я тут!");
        someuser1.sendMessage(someuser3, "Меня зовут " + someuser1.getUsername());

        someuser3.sendMessage(someuser1, "Приятно познакомиться, ув. " + someuser1.getUsername());

        MessageDatabase.showDialog(someuser1, someuser3);
        //System.out.println(MessageDatabase.getMessages());
    }
}
