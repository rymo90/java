class multi_construct_object{
  public static void main(String[] args) {
    
    multi_const consobjekt = new multi_const();
    multi_const consobjekt2 = new multi_const(5);
    multi_const consobjekt3 = new multi_const(5,13);
    multi_const consobjekt4 = new multi_const(5,13,43);

    System.out.printf("%s\n", consobjekt.ToMilit());
    System.out.printf("%s\n", consobjekt2.ToMilit());
    System.out.printf("%s\n", consobjekt3.ToMilit());
    System.out.printf("%s\n", consobjekt4.ToMilit());



  }
}
