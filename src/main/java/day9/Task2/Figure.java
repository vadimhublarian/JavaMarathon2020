package day9.Task2;

/**
 * Created by Vadim Khublarian on 12/8/20.
 */
public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

}
