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
          System.out.println("user pressed 1\n");
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
    String question = "(1) press number 1\n"
                    + "(2) press number 2\n"
                    + "(close) to end program\n";

    System.out.println(question);
  }
}
