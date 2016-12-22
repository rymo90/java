import java.io.*;
import java.util.*;

public class recursion {

    public static int  factorial(int n){
        if(n <1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        input.close();
        System.out.println(factorial(d));
    }
}
