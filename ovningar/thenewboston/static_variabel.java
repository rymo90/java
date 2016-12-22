public class static_variabel{
  private String first;
  private String last;
  private static int members = 0;     // one objekt change every objekt change
                                      // static variabls share with all objects

  public static_variabel(String fn, String ln){
    first = fn;
    last = ln;
    members ++;

    System.out.printf("Constructor for %s %s, member in club: %d\n", first, last, members);
  }

  public String getfirst(){
    return first;

  }
  public String getlast(){
    return last;
  }
  public static int getmembers(){
    return members;
  }

}
