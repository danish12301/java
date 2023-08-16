package ex08_2_exercise;

public class Item {
    private String desc;
    private int quantity;
    private double price;
    private char colorCode = 'U'; // 'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", " + colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemDisplay(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemDisplay(String desc, int quantity, double price, char colorCode) {
        if (colorCode == ' '){
            this.colorCode = colorCode;
            return -1;
        }
        this.colorCode = colorCode;
        setItemDisplay(desc, quantity, price);
        return 1;
    }
}
