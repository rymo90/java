import java.util.*;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import java.util.stream.IntStream;

public class sevenwonders{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    int[] result = new int[3];
    int c=0;
    int g=0;
    int t=0;
    double sum=0;
    for (int i=0;i<s.length() ;i++ ) {
      if (s.charAt(i)=='T') {
        t++;
      }else if(s.charAt(i)=='G'){
        g++;
      }else{
        c++;
      }
    }
    result[0]=c;
    result[1]=g;
    result[2]=t;
    Arrays.sort(result);
    double atleast = 0;
    boolean contains = IntStream.of(result).anyMatch(x -> x == 0);
    if (contains==true) {
      atleast=0;
    }else{
      atleast = 7;
    }
    for (int j=0;j<result.length ; j++) {
      double d = pow(result[j],2);
      sum+=d;
    }
    System.out.println(round(sum +(atleast * result[0])));
  }
}
