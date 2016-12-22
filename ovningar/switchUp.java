public class switchUp {
  public static void main(String[] args) {
    int grade = 80;
    Integer tempgrade = grade / 10;
    switch(tempgrade){
      case 10:
          System.out.println('X');
          break;
      case 9:
          System.out.println('A');
          break;
      case 8:
          System.out.println('B');
          break;
      case 7:
          System.out.println('c');
          break;
      case 6:
          System.out.println('A');
          break;
      default:
          System.out.println('F');
    }
  }
}
