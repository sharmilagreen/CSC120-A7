/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

    private Hashtable<String, Boolean> collection;
    
    public Library() {
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){

    }

    public String removeTitle(String title){

    }
    
    public void checkOut(String title){

    }

    public void returnBook(String title){

    }

    public boolean containsTitle(String title){

    }

    public boolean isAvailable(String title){

    }

    public void printCollection(){

    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }