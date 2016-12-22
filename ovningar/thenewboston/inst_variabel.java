public class inst_variabel{
  private int sum;
  private final int NUMBER; // konstan i storbokstav
                              // final kan inte ändra variabel
  public inst_variabel(int x){
    NUMBER = x;
  }
  public void add(){
    sum += NUMBER;
  }
  public String toString(){
    return String.format("sum = %d\n", sum);

  }


}
