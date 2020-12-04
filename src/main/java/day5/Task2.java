package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike(2018, "Yellow", "YAMAHA");

        System.out.println("Модель: " + myBike.getModel());
        System.out.println("Цвет: " + myBike.getColor());
        System.out.println("Год выпуска: " + myBike.getYear());
    }
}
