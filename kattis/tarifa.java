import java.util.*;
public class tarifa{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int n = input.nextInt();
    int p = 0;
    for (int i=0;i< dagar ;i++ ) {
      p += input.nextInt();
    }
    System.out.println(((x*n)-p)+x);
  }
}
