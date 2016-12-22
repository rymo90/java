import java.util.Scanner;

class math_operator {
  public static void main(String[] args) {
    Scanner math = new Scanner(System.in);
    int girls, boys, people; // data typ heltal // the answer will always will be
    girls = 7;
    boys = 2;
    people = girls % boys;   // modul get three rest
    System.out.println(people);
  }
}
