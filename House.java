/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * Constructs a new House with a specified name, address, and number of Floors, as well as a boolean to decide if the house has a dining room
   * Also initializes an array list of residents
   * 
   * @param hasDiningRoom boolean deciding if the house has a dining room or not
   * @param name The name of the house
   * @param address the address of the house
   * @param nFloors the number of floors the house has
   */
  public House(boolean hasDiningRoom, String name, String address, int nFloors){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Moves a resident into the building
   * Adds student to the residents array list
   * @param s the student being added to the house
   */      
  public void moveIn(Student s){
    residents.add(s);
  }

  /**
   * Removes a resident from the building
   * Removes student from the residents array list
   * @param s the student being removed from the house
   */      
  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  /**
   * Gets the dining room boolean to check if house has a dining room or not
   * @return the dining room boolean
   */  
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /**
   * Gets the capacity of the house
   * @return the size of the residents array list
   */  
  public int nResidents(){
    return residents.size();
  }

  /**
   * Checks if a student is a resident in the house
   * @return true if student is found in the residents arraylist
   * @return false otherwise
   */  
  public boolean isResident(Student s){
    for(Student k: residents){
      if(k==s){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new House(true, "YourMom", "YourMom St", 3);
  }

}