import java.util.*;
public class apaxiaaans{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    StringBuilder fixa = new StringBuilder();
    char test = 'm';
    for (int i=0;i<s.length() ;i++ ) {
      if (s.charAt(i)!= test) {
        fixa.append(s.charAt(i));
      }
      test = s.charAt(i);
    }
    System.out.println(fixa.toString());
  }
}
