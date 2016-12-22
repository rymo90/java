import java.util.*;
public class hello{
  int randtal;
  int max;
  Scanner input = new Scanner(System.in);

  public hello(){
    Random nummer = new Random();
    max = 100;
    randtal = Math.abs(nummer.nextInt()%(max+1));

  }
  public void spela(){
    //int gissa = input.nextInt();
    while (true) {
      int gissa = input.nextInt();
      if ( gissa > randtal) {
        System.out.println("Giss läggre");
      }
      else if (gissa < randtal) {
        System.out.println("Gissa högre");
      }
      else {
        System.out.println("Grattis du har gissat rätt");
        break;
      }
    }
  }
  public static void main(String[] args) {
    hello obgissa = new hello();
    System.out.println("Välkomen till Gissa det rätta nummmer spel . gisss"
                    + " mellan 0 till " +obgissa.max + "includerar");
    obgissa.spela();
  }
}
