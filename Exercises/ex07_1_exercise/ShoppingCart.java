package ex07_1_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName, lastName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ", 1);
        System.out.println("Customer Name: " + custName);
        System.out.println("Space Index: " + spaceIdx);

        firstName = custName.substring(0, spaceIdx);
        lastName = custName.substring(spaceIdx, custName.length());
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
