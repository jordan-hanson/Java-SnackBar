package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private static int vendingMachineId = 125;



    //Constructor
    public Snack(String name, int quantity, double cost) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }


    //Getters
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
    public double getCost() {
        return this.cost;
    }
    public int getVendingMachineId() {
        return this.vendingMachineId;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setCost(double amount){
        this.cost = amount;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }
    public void setMaxId(int id){
        this.maxId = id;
    }

    @Override
    public String toString(){
        String rtnStr =
        "Id: " + ", Name: " + name + " , Quantity: " + quantity + " , Cost: " + cost + " , VendingMachineId: " + vendingMachineId;
        return rtnStr;
    };

}