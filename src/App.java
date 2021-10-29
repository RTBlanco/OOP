public class App {
  public static void main(String[] args) throws Exception {
    Owner ronny = new Owner("Ronny");
    ronny.pets.add(new Pet("Rosy", ronny));
    ronny.pets.add(new Pet("flash", ronny));

    Dog dog = new Dog("lucy", ronny, "rat");
    ronny.pets.add(dog);


    for (int i = 0; i < ronny.pets.size() ; i++) {
      Pet animal = ronny.pets.get(i);
      System.out.println(animal.name);
    }

  }
}
