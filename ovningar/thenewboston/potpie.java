public class potpie{
  private int day;
  private int month;
  private int year;

  public potpie(int d, int m, int y){
    day = d;
    month = m;
    year = y;

    System.out.printf("The constructor for this is %s\n", this);// refering to en objekt(string objekt)
  }

  public String toString(){ // s string objekt representation 
    return String.format("%d/%d/%d", day, month, year);
  }
}
