import java.util.Scanner;
class average{
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int total = 0;
    int grade;
    int avr ;
    int counter = 0;

    while (counter < 10) {
      grade = input.nextInt();
      total = total + grade;
      counter++;
    }
    avr = total/10;
    System.out.println("you average is "+ avr);
  }
}
