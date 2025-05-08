public class Building implements BuildingRequirements {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;


    /**
     * Constructs a new Building with a specified name, address, and number of Floors
     *
     * @param name The name of the building
     * @param address the address of the building
     * @param nFloors the number of floors the building has, which throws an exception if less than 1
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }


    /**
     * Gets the name of the building
     *
     * @return the building's name
     */    
    public String getName() {
        return this.name;
    }

    /**
     * Gets the address of the building
     *
     * @return the building's address
     */        
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the number of floors of the building
     *
     * @return the building's number of floors
     */ 
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Specifies String description of a building
     *
     * @return a string containing the building's name, # of floors, and address
     */ 
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
