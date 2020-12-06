package day7;

/**
 * Created by MasterJedi on 06.12.2020.
 * JavaMarathon2020
 */
public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (this.stamina > 0) {
            this.stamina--;
        }
        if (this.stamina == 0) {
            System.out.println("Игроку нужен отдых и он уходит с поля");
            if (countPlayers > 0) countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
