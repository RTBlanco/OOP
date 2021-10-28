import java.util.ArrayList;

public class Owner {
  String name;
  public ArrayList<Pet> pets = new ArrayList<Pet>();
  static ArrayList<Owner> owners = new ArrayList<Owner>();

  public Owner(String ownerName) {
    this.name = ownerName;
    // ArrayList<Pet> pets = new ArrayList<Pet>();
    owners.add(this);
  }

}
