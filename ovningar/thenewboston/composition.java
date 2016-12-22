public class composition{
  private String name;
  private potpie birthday;  // composition 

  public composition(String theName, potpie thebirthday){
    name = theName;
    birthday = thebirthday;
  }

  public String toString(){
    return String.format("My name is %s, my birthday is %s", name, birthday);
  }

}
