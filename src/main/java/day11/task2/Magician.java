package day11.task2;

/**
 * Created by Vadim Khublarian on 12/12/20.
 */
public class Magician extends Hero implements MagicAttack {

    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0; // physDef percentage
        magicDef = 80 * 0.01; // magicDef percentage
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
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
