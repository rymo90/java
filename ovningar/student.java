public class student{
  public static Integer numStudents = 0;

  private int id;
  private String name;

  public student(Integer id, String name){
    this.id = id;
    this.name = name;

    numStudents = numStudents + 1;
  }
  public static void main(String[] args) {
    for (Integer i = 0; i < 10; i++ ) {
      student s = new student(i,"student"+i.toString());
    }
    System.out.println("The number of students: "+student.numStudents.toString());
  }
}
