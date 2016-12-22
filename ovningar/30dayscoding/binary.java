import java.io.*;
import java.util.*;

public class binary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String [] by = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : by){
            if(s.length() > max){
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
