package snackBarApp;

public class Snack {
    private int maxId;
    private int id;
    private String name;
    private int quantity;
    private int cost;
    private int vendingMachineId;

    public int getId() {
        return this.id;
    }
    public int getMaxId() {
        return this.maxId;
    }
    public String getName() {
        return this.name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public int getCost() {
        return this.cost;
    }
    public int getVendingMachineId() {
        return this.vendingMachineId;
    }
}