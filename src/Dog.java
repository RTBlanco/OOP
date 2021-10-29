public class Dog extends Pet{
  String breed;

  public Dog(String name, Owner owner, String dogBreed) {
    super(name, owner);
    this.breed = dogBreed;
  }
  
}
