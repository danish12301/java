package Challenge;

public class Bicycle {
    private int bikeID;
    private String bikeMake;
    private String bikeModel;
    private char bikeSize;
    private double bikePrice;
    private BikeStyle bikeStyle;
    BikeStyle[] styles = new BikeStyle[] {
            new BikeStyle(1, "BMX", "This is a BMX Bike", "20in"),
            new BikeStyle(2, "Road", "This is a Road Bike", "700c"),
            new BikeStyle(3, "MTB", "This is a Mountain Bike", "29 in") };

    public Bicycle(int bikeID, String bikeMake, String bikeModel, char bikeSize, double bikePrice) {
        // BikeStyle bikeStyle) {
        this.bikeID = bikeID;
        this.bikeMake = bikeMake;
        this.bikeSize = bikeSize;
        this.bikeModel = bikeModel;
        this.bikePrice = bikePrice;
        // this.bikeStyle = bikeStyle;
    }

    public static void main(String[] args) {

        Bicycle myTrekBicycle = new Bicycle(1, "Trek", "Fatboy",
                'X', 899.99);
        Bicycle myDBBicyle = new Bicycle(2, "DiamondBack", "Trace",
                'L', 499.99);

        System.out.println("Trek Bike Details: ");
        System.out.println("Bike Name: " + myTrekBicycle.bikeMake);
        System.out.println("Bike Model: " + myTrekBicycle.bikeModel);
        System.out.println("Bike Size: " + myTrekBicycle.bikeSize);
        System.out.println("Bike Price: " + myTrekBicycle.bikePrice);
        System.out.println("Bike Style: ");

        System.out.println("DiamondBack Bike Details: ");
        System.out.println("Bike Name: " + myDBBicyle.bikeMake);
        System.out.println("Bike Model: " + myDBBicyle.bikeModel);
        System.out.println("Bike Size: " + myDBBicyle.bikeSize);
        System.out.println("Bike Price: " + myDBBicyle.bikePrice);
        System.out.println("Bike Style: ");

    }
}
