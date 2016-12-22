class compund{
  public static void main(String[] args) {
    double amount;    // anoum
    double principal = 10000;  // start point
    double rate = 0.01;   // rate 

    for (int day=1;day<=20 ;day++ ) {
      amount= principal*Math.pow(1+rate,day);
      System.out.println(day + "   "+ amount);
    }
  }
}
