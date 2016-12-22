class static_objekt{
  public static void main(String[] args) {
    static_variabel statobj = new static_variabel("omar", "suleman");
    static_variabel statobj2 = new static_variabel("yassin", "khader");

    System.out.println();
    System.out.println(statobj2.getfirst());
    System.out.println(statobj2.getlast());
    System.out.println(statobj2.getmembers());

    System.out.println(static_variabel.getmembers());


  }
}
