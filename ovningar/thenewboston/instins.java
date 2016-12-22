public class instins{
  private String girlname;  // instints variabel

  public instins(String name){ // construktor helps you initilay as soon you creat a class
    girlname = name;
  }

  public void setName(String name){
    girlname= name;
  }
  public String GetName(){
    return girlname;
  }
  public void saying(){
    System.out.printf("your frist girlfriend was %s", GetName());
  }
}
