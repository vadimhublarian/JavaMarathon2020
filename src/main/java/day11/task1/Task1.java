package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w1 = new Warehouse();
        Worker picker1 = new Picker(w1);
        Worker courier1 = new Courier(w1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(w1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

        Warehouse w2 = new Warehouse();
        Worker picker2 = new Picker(w2);
        Worker courier2 = new Courier(w2);
        picker2.doWork();
        courier2.doWork();

        System.out.println(w1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
            worker.bonus();
        }
    }
}
