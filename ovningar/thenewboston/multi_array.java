class multi_array{
  public static void main(String[] args) {
    int firstarray[][] = {{8,9,10,12},{12,13,14,15}};
    int secondarray[][] = {{30,31,32,33},{34},{4,5,6}};

    System.out.println("This is the first array");
    display(firstarray);
    System.out.println("This is the secound array");
    display(secondarray);
  }
  public static void display(int x[][]){
    for (int row = 0; row< x.length ;row ++ ) {
      for (int colum = 0; colum <x[row].length ;colum++ ) {
        System.out.println(x[row][colum] + "\t");
      }
      System.out.println();
    }
  }
}
