import java.util.*;
import java.lang.*;
import java.io.*;

public class exampel{

  public static int search(int arr[], int n, int x){
    for (int i = 0; i < n ;i++ ) {
      if(arr[i]==x){
        arr[i]= i;
      }else{
        arr[i] = -1;
      }
    }
    return arr
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[100];
    int t = input.nextInt();
    while ( t > 0) {
      int n = input.nextInt();
      for (int i = 0; i < n ;i++ ) {
        arr[i] = input.nextInt();
      }
      int x = input.nextInt();
      System.out.println(search(arr, n, x));
      t--;
    }
  }
}
