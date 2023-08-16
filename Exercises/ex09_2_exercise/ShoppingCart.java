package ex09_2_exercise;

public class ShoppingCart {
    public static void main(String args[]) {
        // Declare, instantiate, and initialize a Customer object
/* 
        Customer newCust1 = new Customer("Laxmana", "123456789");
        Customer newCust2 = new Customer("Ram", "999999999");
        Customer newCust3 = new Customer("Raju", "987654321");
*/
        Customer[] customers = new Customer[3];

        customers[0] = new Customer("Laxmana", "123456789");
        customers[1] = new Customer("Ram", "999999999");
        customers[2] = new Customer("Raju", "987654321");
        
        for(int i=0; i<3; i++){
            System.out.println("Customer Name: " + customers[i].getName());
            System.out.println("Customer SSN: " + customers[i].getSSN());
        }
        // Print the customer object name
        /*
        System.out.println("Customer Name: " + newCust1.getName());
        System.out.println("Customer SSN: " + newCust1.getSSN());

        System.out.println("Customer Name: " + newCust2.getName());
        System.out.println("Customer SSN: " + newCust2.getSSN());

        System.out.println("Customer Name: " + newCust3.getName());
        System.out.println("Customer SSN: " + newCust3.getSSN());

        newCust1.setName("LB");
        System.out.println("Customer Name: " + newCust1.getName());
        System.out.println("Customer SSN: " + newCust1.getSSN());
         */
    }
}
