package ex05_1_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith", itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04, total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        Boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message = message += "s";
        }
        // Test outOfStock and notify user in either case.
        if (outOfStock == true) {
            System.out.println("Requested item is out of stock. " + message);
        } else {
            System.out.println(message + ". The total cost is: " + total);
        }
    }
}
