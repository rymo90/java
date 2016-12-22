class multipul_class{
  multipul_class(){
    System.out.println("constructor of computer class");
  }
  void computer_method(){
    System.out.println("power gone! Shut down you pc soon..")
  }
  
  public static void main(String[] args) {
    multipul_class my = multipul_class();
    Laptop your = new Laptop();

    my.computer_method();
    your.Laptop_method();
  }
}
