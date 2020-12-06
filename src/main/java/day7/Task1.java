package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneAirbus = new Airplane("Airbus", 2000, 20, 59_560);
        Airplane airplaneBoeing = new Airplane("Boeing 747", 1989, 70, 251_740);

        Airplane.compareAirplanes(airplaneAirbus, airplaneBoeing);
    }
}