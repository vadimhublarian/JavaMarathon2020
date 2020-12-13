package day11.task1;

/**
 * Created by Vadim Khublarian on 12/10/20.
 */
public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + this.getCountPickedOrders() +
                "\n" + "Количество доставленных заказов: " + this.getCountDeliveredOrders();
    }

}
