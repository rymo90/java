import java.util.EnumSet;

class enum_objekt{
  public static void main(String[] args) {

    for (enumeration people : enumeration.values())
      System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

    System.out.println("\n And now for the range of constants!!\n");

    for(enumeration people : EnumSet.range(enumeration.redwan, enumeration.candy))
      System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

  }
}
