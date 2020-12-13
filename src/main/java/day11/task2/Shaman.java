package day11.task2;

/**
 * Created by Vadim Khublarian on 12/12/20.
 */
public class Shaman extends Hero implements Healer, MagicAttack {

    int magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 20 * 0.01; // physDef percentage
        magicDef = 20 * 0.01; // magicDef percentage
    }

    @Override
    public void magicalAttack(Hero hero) {
        double hitPoints = magicAtt * (1 - hero.magicDef);
        if (hero.health - hitPoints < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= hitPoints;
        }
    }

    @Override
    public void healHimself() {
        if (health + 50 > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
