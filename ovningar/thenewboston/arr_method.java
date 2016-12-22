class arr_method{
  public static void main(String[] args) {
    int redwan [] = {3,4,5,6,7}; // skapar en array
    change(redwan);     // lägg arrey till methoden change
    for (int y : redwan ) {
      System.out.println(y);
    }
  }
  public static void change(int x []){ // tar in int from arrgument och det innehåller array
    for (int i = 0; i < x.length ;i++ ) {
      x[i]+= 5; // lägger till 5 till varje värde i array
    }
  }
}
