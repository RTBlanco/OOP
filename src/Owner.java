import java.util.ArrayList;

public class Owner {
  String name;
  // Create an ArrayList containing Pet objects and Pet object subclasses 
  // If needed to create ArrayList that hold other type that are not 
  // subclasses (for ex: Owner and Pet )-> ArrayList<Object>
  public ArrayList<Pet> pets = new ArrayList<Pet>();
  static ArrayList<Owner> owners = new ArrayList<Owner>();

  public Owner(String ownerName) {
    this.name = ownerName;
    owners.add(this);
  }

}
