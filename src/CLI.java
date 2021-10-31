import java.util.Scanner;

public class CLI {
  public static void run() {
    menu();
  }

  private static void menu() {
    Boolean running = true;
    Scanner input = new Scanner(System.in);
    while(running) {
      questions();
      String userInput = input.nextLine();

      switch (userInput) {
        case "1":
          showPets();
          break;
        case "2":
          // adds new pet
          System.out.println("user pressed 2\n");
          break;
        case "3":
          showOwners();
          break;
        case "4":
          // adds new owner
          addOwner(input);
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
                    + "(4) add new owners\n"
                    + "(close) to end program\n";

    System.out.println(question);
  }

  private static void showPets() {
    if ( Pet.all.size() > 0) {
      for(Pet pet: Pet.all) {
        System.out.printf("(%o)%s\n", pet.id, pet.name);
      }
    } else {
      System.out.println("No pets in database\n");
    }
  }

  private static void showOwners() {
    if ( Owner.all.size() > 0) {
      for(Owner owner: Owner.all) {
        System.out.printf("(%o)%s\n", owner.id, owner.name);
      }
    } else {
      System.out.println("No Owners in database\n");
    }
  }

  private static void addOwner(Scanner userInput) {
    while(true) {
      System.out.print("Owner Name: ");
      String firstName = userInput.nextLine();
      if (firstName.length() <= 0) {
        System.out.println("Name need to be at least one character");
      } else {
        new Owner(firstName);
        break;
      }
    }
  }
 }
