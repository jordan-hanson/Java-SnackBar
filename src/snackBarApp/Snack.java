package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity = 0;
    private int cost = 0;
    private static int vendingMachineId = 125;
    private int total;



    //Constructor
    public Snack(String name, int quantity, int cost) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.total = quantity * cost;
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
    public int getTotal(){
        return this.total;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
//    public void setQuantity(int quantity){
//        if(this.quantity < quantity) {
//            this.quantity = quantity;
//        } else {
//            this.quantity = quantity;
//        };
//    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }
    public void setMaxId(int id){
        this.maxId = id;
    }
    public void setTotal(){
        this.total = total;
    }

    @Override
    public String toString(){
        String rtnStr =
        "Id: " + id + "\n"
                + "Name: " + name + "\n"
                + "Quantity: " + quantity + "\n"
                + "Cost: " + cost + "\n"
                + "VendingMachineId: " + vendingMachineId + "\n"
                + "Total: " + total + "\n"
                + "__________________";
        return rtnStr;
    };

}