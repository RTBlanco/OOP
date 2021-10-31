import java.util.Scanner;

public class CLI {
  static public void run() {

    Boolean running = true;
    while(running) {
      questions();
      Scanner input = new Scanner(System.in);
      String userInput = input.nextLine();

      switch (userInput) {
        case "1":
          showPets();
          break;
        case "2":
          System.out.println("user pressed 2\n");
          break;
        case "close":
          input.close();
          running = !running;
          break;
        default:
          break;
      }
    }  
  }

  private static void questions() {
    String question = "\n(1) view pets\n"
                    + "(2) add new pet\n"
                    + "(3) view owners\n"
                    + "(4) add new owners"
                    + "(close) to end program\n";

    System.out.println(question);
  }

  private static void showPets() {
    if ( Pet.all.size() > 0) {
      for(Pet pet: Pet.all) {
        System.out.println(pet);
      }
    } else {
      System.out.println("No pets in database\n");
    }
  }

  private static void showOwners() {

  }
}
