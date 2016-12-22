class inst_variabel_objekt{
  public static void main(String[] args) {

    inst_variabel inst_var_obje = new inst_variabel(10);

    for(int i=0; i<5; i++){
      inst_var_obje.add();
      System.out.printf("%s",inst_var_obje );
    }
  }
}
