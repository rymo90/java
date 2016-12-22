import java.util.*;
public class solution{

  public static void veckor(int m, Scanner input){
    String dag;
    for (int i = 0; i < m ;i++ ) {
      System.out.print(i + " ");
      dag = input.nextLine();
      return dag;
    }
  }

  public static void dagsompassar(int d, Scanner input){
    String namn;
    int  inDex;
    for (int j = 0;j < d ;j++ ) {
      namn = input.next();
      input.nextLine();
      inDex= input.nextInt();
      //return inDex;
      System.out.print(inDex);
    }

  }

  public static void main(String[] args) {
    //solution borja = new solution();
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    int d = input.nextInt();
    input.nextLine();
    String a = veckor(m,input);
    int b = dagsompassar(d,input);
  }


}
