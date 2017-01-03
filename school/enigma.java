import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class enigma{

  public  static int[] indexOf(String kryptext, String klartext){
    char[] krypchar = kryptext.toCharArray();
    char[] klarchar = klartext.toCharArray();
    int diff = krypchar.length - klarchar.length;
    int counter = 0;
    int[] resultat = new int [diff];
    for (int i = 0; i < diff ;i++ ) {
      for (int j = 0; j< klarchar.length;j++ ) {
        if (klarchar[j]!= krypchar[j]) {
          resultat[i] = i;
        }else{
          break;
        }
        // resultat[i] = counter;
      }
    }
    return resultat;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String kryptext = input.next();
    String klartext = input.next();
    enigma start = new enigma();
    // start.indexOf(kryptext,klartext);
    int svar[] = start.indexOf(kryptext, klartext);
    for (int l = 0; l < svar.length ;l++ ) {
      System.out.print(' ');
      System.out.print(svar[l] + " ");
    }

    }

}
