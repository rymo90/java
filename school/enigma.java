import java.util.Scanner;
import java.util.ArrayList;

public class enigma{

  public  static int[] indexOf(String kryptext, String klartext){
  int diff = kryptext.length()- klartext.length();
  int[] counter = new int[0];
  for (int i = 0 ;i<= diff ;i++ ) {
    for (int j = 0; j< klartext.length() ;j++ ) {
      if (kryptext.charAt(i+j) != klartext.charAt(j)) {
        counter[j] = i;
      }
      else {
        break;
      }
    }
  }
  return counter;
}


  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String kryptext = input.next();
    String klartext = input.next();
    enigma start = new enigma();
    start.indexOf(kryptext,klartext);
    int svar[] = start.indexOf(kryptext, klartext);
    for (int l = 0; l < svar.length ;l++ ) {
      System.out.print(' ');
      System.out.print(svar[l] + " ");
    }

    }

}
