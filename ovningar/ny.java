import java.util.*;
public class ny{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    calculeter(n, in);
  }

  public static void calculeter(int n, Scanner in){
    while (n >= 2 && n<= 20) {
      for (int i = 1;i <=10 ;i++ ) {
        int c = n * i;
        System.out.println("2 x "+ i + " = " + c );
      }
      n++;
      break;
    }


    }



}
