import java.util.Scanner;

class calculetor{
public static void main(String[] args){
                 Scanner in = new Scanner(System.in);


               //finding the length of the Array studentNames
               System.out.print("how many students?:");
               int totalStudents = in.nextInt();

     String[] studentNames = new String [totalStudents];

        //allows user to input student names

    for(int j = 0; j <= studentNames.length;j++){
        System.out.print(j + " ");
        //System.out.print("enter student names:");
        studentNames[j] = in.nextLine();
    }

        for (String element:studentNames)
        {
       System.out.println(element);
        }
  }
}
