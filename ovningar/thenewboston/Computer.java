class Computer{
  Computer(){
    System.out.println("constructor of computer class");
  }
  void computer_method(){
    System.out.println("power gone! Shut down you pc soon...");
  }

  public static void main(String[] args) {
    Computer my = new Computer();
    Laptop your = new Laptop();

    my.computer_method();
    your.Laptop_method();
  }
}

class Laptop{
  Laptop() {
    System.out.println("Constructor of Laptop class");
  }
  void Laptop_method(){
    System.out.println("99% Batter Available");
  }
}
