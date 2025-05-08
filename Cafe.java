/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor for the Cafe class.
     * Initializes the Cafe with a name, address, and number of floors, and initializes the stock of the cafe (coffee, sugar, creams, cups) as a set amount each
     * @param name The cafe's name
     * @param address the cafe's address
     * @param nFloors the cafe's number of floors
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 1000;
        nSugarPackets = 1000;
        nCreams = 1000;
        nCups = 1000;
    }

    /**
     * Sells coffee, decreasing the stock of the cafe
     * @param size the size of the coffee requested
     * @param nSugarPackets the amount of sugar packets requested for the coffee
     * @param nCream the amount of cream requested for the coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        nCups -= 1;
    }

    /**
     * Restocks the cafe
     * @param nCoffeeOunces the amount of coffee ounces being added to leftover stock
     * @param nSugarPackets the amount of sugar packets being added to leftover stock
     * @param nCream the amount of cream being added to leftover stock
     * @param nCups the amount of cups being added to leftover stock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {

    }
    
}
