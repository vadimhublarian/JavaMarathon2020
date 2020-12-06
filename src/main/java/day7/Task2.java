package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player player2 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player player3 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player player4 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player player5 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player player6 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        Player.info();
        System.out.println(Player.countPlayers);
        Player player7 = new Player(random.nextInt(Player.MAX_STAMINA + Player.MAX_STAMINA - 10));
        System.out.println(Player.countPlayers);

        while (player1.getStamina() != Player.MIN_STAMINA) {
            player1.run();
        }
        System.out.println(Player.countPlayers);
    }
}
