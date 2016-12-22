import java.util.Scanner;

class method_parameter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    metod metodobjekt = new metod();

    System.out.println("Enter your name here:");
    String name = input.nextLine();


    metodobjekt.simpleMessage(name);
  }
}
