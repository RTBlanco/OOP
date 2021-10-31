import java.util.ArrayList;

public class Pet {
  String name;
  Owner owner;

  static ArrayList<Pet> all = new ArrayList<Pet>();

  public Pet(String name, Owner owner) {
    this.name = name;
    this.owner = owner;
  }

  public Pet(String name) {
    this.name = name;
  }

  public void getName() {
    System.out.println(this.name);
  }
}
