package ex05_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase several items.";
        String[] items = { "Shirt", "Trouser", "Cap", "Wallet" };

        message = custName + "wants to purchase " + items.length + " items. ";

        System.out.println(message);

        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        System.out.println(items[3]);

        System.out.println(custName + " wants to purchase " + items.length + " items. They are: ");

        for (String item : items) {
            System.out.println(item);
        }
    }
}
