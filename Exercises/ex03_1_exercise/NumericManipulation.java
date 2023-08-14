package ex03_1_exercise;

public class NumericManipulation {
    public static void main(String[] args) {
        double price = 20.5, tax = 0.05, total;
        int quantity = 1;
        String custName = "Mary Smith", itemDesc = "Shirt";
        String message = custName + " wants to purchase " + quantity + " " + itemDesc + ". ";
        total = price * quantity * (1 + tax);
        System.out.println(message);
        System.out.printf("Total cost with tax is: %.2f. ", total);
    }

}
