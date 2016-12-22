import java.util.Scanner;
public class bijele {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] klar = {1,1,2,2,2,8};
    int[] num = new int [6];

    for (int i = 0; i < 6 ;i++) {
      int c = input.nextInt();
      num[i] = c;
    }
    for (int g :num ) {
      System.out.println(g);
    }
  }
}
