import java.util.*;
public class grassseed{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double c = input.nextDouble();
    int l = input.nextInt();
    double sum=0;
    for (int i=0;i<l ;i++ ) {
      double w = input.nextDouble();
      double w2 = input.nextDouble();
      sum += (w*w2)*c;
    }
    System.out.printf("%.7f\n", sum);
  }
}
