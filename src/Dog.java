import java.util.ArrayList;

public class Dog extends Pet{
  String breed;

  public Dog(String name, Owner owner, String dogBreed) {
    super(name, owner);
    this.breed = dogBreed;
    Pet.all.add(this);
  }

  public Dog(String name, String dogBreed) {
    super(name);
    this.breed = dogBreed;
    Pet.all.add(this);
  }
  
}
