package day11.task1;

/**
 * Created by Vadim Khublarian on 12/10/20.
 */
public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {

        return isPayed;
    }

    @Override
    public String toString() {
        if (isPayed()) return "Заработная плата: " + this.getSalary() +
                "\n" + "Был выплачен бонус";
        else return "Заработная плата: " + this.getSalary() +
                "\n" + "Бонус выплачен не был";
    }

    @Override
    public void doWork() {
        w.setCountDeliveredOrders(w.getCountDeliveredOrders() + 1);
        salary += 100;
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() == 10_000 && !this.isPayed()) {
            this.salary = this.getSalary() + 50_000;
            this.isPayed = true;
        } else {
            if (this.isPayed()) {
                System.out.println("Бонус уже был выплачен");
            } else System.out.println("Бонус пока не доступен");
        }
    }
}
