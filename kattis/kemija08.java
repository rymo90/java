import java.util.*;
public class kemija08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    // input.next();
    String sub="";
    ArrayList<Character> obj = new ArrayList<Character>();
    obj.add('a');
    obj.add('e');
    obj.add('i');
    obj.add('o');
    obj.add('u');
    int num= 0;
    for (int i=0;i<s.length() ;i++ ) {
      if (obj.contains(s.charAt(i))) {
        if (num==0) {
          num = 1;
        }else{
          sub+=s.charAt(i);
          num = 0;
        }
      }else if( s.charAt(i)=='p'){
        if (num ==1) {
          continue;
        }else{
          sub+= s.charAt(i);
        }
      }else{
        sub+=s.charAt(i);
      }
    }
    System.out.println(sub);
  }
}
