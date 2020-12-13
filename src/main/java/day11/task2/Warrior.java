package day11.task2;

/**
 * Created by Vadim Khublarian on 12/12/20.
 */
public class Warrior extends Hero {
    public Warrior() {
        physAtt = 30;
        physDef = 80 * 0.01; // physDef percentage
        magicDef = 0; // magicDef percentage
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
