import java.util.*;
import java.lang.*;


public class enigma{


  public static void indexOf(String kryptxt, String cleartxt){
    char [] krypchar = kryptxt.toCharArray();
    char [] clearchar = cleartxt.toCharArray();
    int diff = krypchar.length - clearchar.length;
    boolean no_sol_found = true;
    for (int i = 0;i <=diff ;i++ ) {
      boolean found_sol = true;
      for (int j = 0;j < clearchar.length ;j++ ) {
        if(clearchar[j] == krypchar[j+i]){
          found_sol = false;
          break;
        }
      }
      if (found_sol){

        no_sol_found = false;
        System.out.print(i+1);
        System.out.print(" ");
      }
    }
    if (no_sol_found)
    {
      System.out.print(-1);
    }
}

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String kryptxt = input.next();
    String cleartxt = input.next();
    char [] krypchar = kryptxt.toCharArray();
    char [] clearchar = cleartxt.toCharArray();
    // enigma start= new enigma();
    indexOf(kryptxt, cleartxt);


  }
}
