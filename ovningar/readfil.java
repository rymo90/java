import java.io.*;
import java.util.*;

public class readfil{
  public static void main(String[] args) {
    
  }
  private Scanner x;

  public void openFile(){
    try{
      x = new Scanner(new File("bokning.txt"));
    }
    catch (Exception e) {
      System.out.println("Could not find fil");
    }
  }
  public void readFile(){
    while (x.hasNext()) {
      String a = x.next();
      String b = x.next();
      String c = x.next();
      String d = x.next();
      String e = x.next();

      System.out.printf("%s %s %s %s %s \n", a,b,c,d,e );
    }
  }
  public void closeFile(){
    x.close();
  }
}
