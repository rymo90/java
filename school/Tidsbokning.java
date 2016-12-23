import java.util.Scanner;
public class Tidsbokning{

  public String[] veckor(int index , Scanner input){
    String dagar;
    String[] vecka = new String[index];
    for (int i = 0; i < index ;i++ ) {
      System.out.print(i + " ");
      input.next();
      dagar = input.nextLine();
      vecka[i] = dagar;
    }
    return vecka;


  }
  public String[] bokning(int namn,  Scanner input){
    String[] boka = new String[namn];
    String personer, tider;
    for (int j = 0;j < namn ;j++ ) {
      personer = input.next();
      input.next();
      tider = input.nextLine();
      boka[j] = tider;
    }
    return boka;

  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int index, namn;
    index = input.nextInt();
    namn = input.nextInt();
    Tidsbokning start = new Tidsbokning();
    String[] A = start.veckor(index, input);
    String[] B = start.bokning(namn,input);

  }
}
