class var_length{
  public static void main(String[] args) {
    System.out.println(average(43,45,43,56,67));

  }

  public static int average(int...numbers){ //... means you don't know how many argument you are going to take
    int total = 0;
    for (int x : numbers )
      total += x;

      return total/numbers.length;

  }
}
