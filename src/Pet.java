public class Pet {
  String name;
  Owner owner;

  public Pet(String name, Owner owner) {
    this.name = name;
    this.owner = owner;
  }

  public void getName() {
    System.out.println(this.name);
  }
}
