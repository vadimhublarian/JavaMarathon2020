package day7;

/**
 * Created by MasterJedi on 06.12.2020.
 * JavaMarathon2020
 */
public class Player {

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina == 0) return; // exit 0;
        if (this.stamina > 0) this.stamina--;
        if (this.stamina == 0 && countPlayers > 0) countPlayers--;
    }
}
