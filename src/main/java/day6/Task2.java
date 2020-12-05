package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2000, 20, 59_560);

        airplane.setYear(2015);
        airplane.setLength(35);
        airplane.fillUp(100);
        airplane.fillUp(200);

        airplane.info();
    }
}
