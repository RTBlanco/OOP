import java.util.ArrayList;

public class Owner {
  String name;
  public ArrayList<Object> pets = new ArrayList<Object>();
  static ArrayList<Owner> owners = new ArrayList<Owner>();

  public Owner(String ownerName) {
    this.name = ownerName;
    owners.add(this);
  }

}
