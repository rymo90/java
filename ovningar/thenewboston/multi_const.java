public class multi_const{
  private int hour;
  private int minutes;
  private int secound;

  public multi_const(){
    this(0,0,0);
  }
  public multi_const(int h){
    this(h,0,0);
  }
  public multi_const(int h, int m){
    this(h,m,0);
  }
  public multi_const(int h, int m, int s){
    setTime(h,m,s);
  }
  public void setTime(int h, int m, int s){
    setHour(h);
    setMinute(m);
    setSecound(s);
  }

  public void setHour(int h){  // void = not return anything
    hour = ((h>=0 && h<24)? h: 0);
  }
  public void setMinute(int m){  // void = not return anything
    minutes = ((m>=0 && m<60)? m: 0);
  }
  public void setSecound(int s){  // void = not return anything
    secound= ((s>=0 && s <60)? s: 0);
  }

  public int getHour(){
    return hour;
  }
  public int getMinute(){
    return minutes;
  }
  public int getSecound(){
    return secound;
  }

  public String ToMilit(){
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecound());
  }




}

/*man kan ha fleara construktor för att göra olika saker
*/
