import java.util.*;
public class evenOdd{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int d = input.nextInt();
    for (int i = 0;i <d ;i++ ) {
      char[] ord = input.next().toCharArray();
      // print even charecters
      for (int j = 0;j<ord.length ;j+=2) {
        System.out.print(ord[j]);
      }
      System.out.print(" ");
      // print odd charecters
      for (int j = 1;j <ord.length ;j +=2 ) {
        System.out.print(ord[j]);
      }
      System.out.println();
    }


  }
}
