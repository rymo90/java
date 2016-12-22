import java.util.Random;

class math{
  public static void main(String[] args) {
  //  System.out.println(Math.floor(5.5));  // ceil up floor down

  Random dice = new Random();
  int number;
  for (int counter = 1;counter<=10 ;counter ++ ) {
    number = 1 + dice.nextInt(6); // lägg till ett för att tar bort 0 ..
    System.out.println(number + " ");
  }

  }

}
