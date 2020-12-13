package day11.task2;

/**
 * Created by Vadim Khublarian on 12/12/20.
 */
public class Paladin extends Hero implements Healer {
    public Paladin() {
        physAtt = 15;
        physDef = 50 * 0.01; // physDef percentage
        magicDef = 20 * 0.01; // magicDef percentage
    }

    @Override
    public void healHimself() {
        if (health + 25 > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 10;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
