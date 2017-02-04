import java.util.*;
public class speedlimit{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    List<Integer> resultat = new ArrayList<Integer>();
    while ((n = input.nextInt()) !=-1) {
      int sum=0;
      int index=0;
      for (int i=0;i<n ;i++ ) {
        int t1=input.nextInt();
        int t2=input.nextInt();
        sum+= t1*(t2-index);
        index=t2;
      }
      resultat.add(sum);
    }
  for (int svar :resultat ) {
    System.out.println(svar + " miles");
  }
  }
}
