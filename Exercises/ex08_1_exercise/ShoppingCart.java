package ex08_1_exercise;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        Item item2 = new Item();
        
        
        if(item1.setColor(' ')){
            System.out.println("Color is: " + item1.color);
        }
        else{
            System.out.println("Invalid Color");
        }
        if(item2.setColor('R')){
            System.out.println("Color is: " + item2.color);
        }
        else{
            System.out.println("Invalid Color");
        }

        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	    //   message.

       // Test the class, using both valid and invalid colors.       
        
    }
}
