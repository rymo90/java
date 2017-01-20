import java.util.*;
public class DiceCup{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a , b;
    a = input.nextInt();
    b = input.nextInt();
    List<Integer> resultat = new ArrayList<Integer>();
    int sum = a+b;
    for (int x = 2;x <= sum ;x++ ) {
      int counter = 0;
      for (int i = 1;i<= a ;i++ ) {
        for (int j=1;j<=b ;j++ ) {
          if ((j)+(i)==(x)) {
            counter++;
          }
        }
      }
      resultat.add(counter);
    }
    for (int g = 0;g<resultat.size() ;g++ ) {
      if (resultat.get(g)==Collections.max(resultat)) {
        System.out.println(g+2);
      }
    }
  }
}
