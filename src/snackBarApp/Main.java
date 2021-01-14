package snackBarApp;

public class Main {
    public static void main(String[] args) {
        Snack snack1 = new Snack("Lays Chips", 3, 2);
        VendingMachine v1 = new VendingMachine("Pepsi");
        System.out.println("SnackBar Yum!");
        System.out.println(snack1);
        System.out.println(v1);
    }
}