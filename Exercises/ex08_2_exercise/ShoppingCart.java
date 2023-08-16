package ex08_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        int retCode = 0;

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemDisplay("Shirt", 1, 5.99);
        item1.displayItem();
        
        // Call the 4-arg setItemFields method, checking the return value.  
        retCode = item1.setItemDisplay("Shirt", 1, 6.99, 'B');
        item1.displayItem();
        System.out.println("Return Code: " +retCode);

        retCode = item1.setItemDisplay("Shirt", 1, 3.99, ' ');
        item1.displayItem();
        System.out.println("Return Code: " +retCode);

        // Test your code for both valid and invalid values
    }
}
