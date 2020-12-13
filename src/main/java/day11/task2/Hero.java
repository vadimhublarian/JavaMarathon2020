package day11.task2;

/**
 * Created by Vadim Khublarian on 12/12/20.
 */
public abstract class Hero implements PhysAttack {
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double hitPoints = physAtt * (1 - hero.physDef);
        if (hero.health - hitPoints < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= hitPoints;
        }
    }
}
