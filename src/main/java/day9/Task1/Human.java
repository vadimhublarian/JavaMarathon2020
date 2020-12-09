package day9.Task1;

/**
 * Created by Vadim Khublarian on 12/8/20.
 */
public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + this.name);
    }
}
