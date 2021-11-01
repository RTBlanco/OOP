import java.util.ArrayList;

public class Pet {
  String name;
  Owner owner;
  Integer id = all.size() + 1;

  static ArrayList<Pet> all = new ArrayList<Pet>();

  public Pet(String name, Owner owner) {
    this.name = name;
    this.owner = owner;
    all.add(this);
  }

  public Pet(String name) {
    this.name = name;
    all.add(this);
  }

  public void getName() {
    System.out.println(this.name);
  }
}
