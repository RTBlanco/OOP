

public class Dog extends Pet{
  String breed;
  // String name

  public Dog(String name, Owner owner, String dogBreed) {
    super(name, owner);
    this.breed = dogBreed;
  }
  
}
