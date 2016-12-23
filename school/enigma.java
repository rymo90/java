import java.util.Scanner;
import java.lang.Math;

public class enigma{

  public int matchingIndex(String kryptext, String klartext){
  char [] first = kryptext.toLowerCase().toCharArray();
  char [] second = klartext.toLowerCase().toCharArray();
  int counter = 0;
  int diff = Math.min(first.length, second.length);
  for (int i = 0; i < diff ;i++ ) {
    if (first[i]!= second[i]) {
      counter++;
      }
    }
    return counter;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String kryptext = input.next();
    String klartext = input.next();
    enigma start = new enigma();
    int svar = start.matchingIndex(kryptext, klartext);
    System.out.println(svar);
  }
}
