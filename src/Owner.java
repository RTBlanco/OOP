import java.util.ArrayList;

public class Owner {
  String name;
  Integer id = all.size() + 1;
  // Create an ArrayList containing Pet objects and Pet object subclasses 
  // If needed to create ArrayList that hold other type that are not 
  // subclasses (for ex: Owner and Pet )-> ArrayList<Object>
  public ArrayList<Pet> pets = new ArrayList<Pet>();
  static ArrayList<Owner> all = new ArrayList<Owner>();

  public Owner(String ownerName) {
    this.name = ownerName;
    all.add(this);
  }

  static public Owner findById(Integer id) {
    // for (Owner owner: all ) {
    //   if (id == owner.id) {
    //     return owner;   
    //   }
    // }
    return all.get(id - 1);
  }

  static public Boolean userExist(Integer id) {
    for (Owner owner: all) {
      if ( owner.id == id ) {
        return true;
      }
    }

    return false;
  }

}
