package day11.task1;

/**
 * Created by Vadim Khublarian on 12/10/20.
 */
public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse w;

    public Picker(Warehouse w) {
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
        w.setCountPickedOrders(w.getCountPickedOrders() + 1);
        salary += 80;
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() == 10_000 && !this.isPayed()) {
            salary = this.getSalary() + 70_000;
            this.isPayed = true;
        } else {
            if (this.isPayed()) {
                System.out.println("Бонус уже был выплачен");
            } else System.out.println("Бонус пока не доступен");
        }
    }
}

