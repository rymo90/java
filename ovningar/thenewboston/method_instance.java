import java.util.Scanner;

class method_instance {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    instins insobjekt = new instins();

    System.out.println("Enter name fo first gf here: ");
    String temp = input.nextLine();
    
    insobjekt.setName(temp);
    insobjekt.saying();
  }
}
