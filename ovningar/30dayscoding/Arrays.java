import java.io.*;
import java.util.*;


public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();

        }
        String resultat="";
        for(int i = arr.length-1; i >=0;i--)
        resultat= resultat+arr[i]+" ";
        System.out.println(resultat);
        


    }
}
