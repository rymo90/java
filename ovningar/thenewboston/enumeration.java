public enum enumeration{
  redwan("nice", "25"),   // konstent  olso objekts
  kelsey("cutie","10"),
  julia("bigmistak","12"),
  nicole("italiean","13"),
  candy("different","14"),
  erin("iwish","16");

  private final String desc;
  private final String year;

  enumeration(String description, String birthday){
    desc = description;
    year = birthday;
  }

  public String getDesc(){
    return desc;
  }
  public String getYear(){
    return year;

  }

}
