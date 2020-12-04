package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Black");
        myCar.setModel("Ford F-150");
        myCar.setYear(2019);

        System.out.println("Модель: " + myCar.getModel());
        System.out.println("Цвет: " + myCar.getColor());
        System.out.println("Год выпуска: " + myCar.getYear());
    }
}
