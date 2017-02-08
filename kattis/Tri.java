import java.util.*;
public class Tri{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String n = input.nextLine();
    Scanner scanner = new Scanner(n);
    List<Integer> list = new ArrayList<Integer>();
    while (scanner.hasNextInt()) {
        list.add(scanner.nextInt());
    }
    if (list.get(0)+list.get(1)==list.get(2)) {
      System.out.println(list.get(0)+"+"+list.get(1)+"="+list.get(2));
    }else if (list.get(0)-list.get(1)==list.get(2)){
      System.out.println(list.get(0)+"-"+list.get(1)+"="+list.get(2));
    }else if(list.get(0)*list.get(1)==list.get(2)){
      System.out.println(list.get(0)+"*"+list.get(1)+"="+list.get(2));
    }else if(list.get(0)/list.get(1)==list.get(2)){
      System.out.println(list.get(0)+"/"+list.get(1)+"="+list.get(2));
    }else if (list.get(0)==list.get(1)+list.get(2)) {
      System.out.println(list.get(0)+"="+list.get(1)+"+"+list.get(2));
    }else if(list.get(0)==list.get(1)-list.get(2)){
      System.out.println(list.get(0)+"="+list.get(1)+"-"+list.get(2));
    }else if(list.get(0)==list.get(1)*list.get(2)){
      System.out.println(list.get(0)+"="+list.get(1)+"*"+list.get(2));
    }else{
      System.out.println(list.get(0)+"="+list.get(1)+"/"+list.get(2));
    }
  }
}
