package day6;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Black");
        myCar.setModel("Ford F-150");
        myCar.setYear(2019);
        myCar.info();
        System.out.println(myCar.yearDifference(2020));

        Motorbike myBike = new Motorbike(2018, "Yellow", "YAMAHA");
        myBike.info();
        System.out.println(myBike.yearDifference(2021));
    }
}
