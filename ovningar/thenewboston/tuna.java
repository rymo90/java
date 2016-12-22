public class tuna {
  private int hour = 1;  // with private you cant change dit, with public you can
  private int minutes = 2;
  private int secound = 3;

  public void setTime(int hour, int minutes , int secound){
    this.hour = 4;
    this.minutes = 5;
    this.secound = 6;

  }

  public String tomilitary(){
    return String.format("%02d:%02d:%02d", hour, minutes, secound);
  }
  public String toString(){
    return String.format("%d:%02d:%02d %s", ((hour==0 || hour == 12 ) ? 12:hour%12), minutes, secound, (hour < 12 ? "AM": "PM"));
  }
}
