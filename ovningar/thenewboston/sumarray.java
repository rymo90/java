
// repitera 
import java.util.Random;

class sumarray{
  public static void main(String[] args) {
    Random redwan = new Random();
    int freq[] = new int[7]; //  array  dice 0-6

    for (int i = 0;i <1000 ;i++ ) { // loop this 100 time
      ++freq[1+redwan.nextInt(6)]; // 1-6

    }
    System.out.println("Face \t Frequency");

    for (int face = 1; face < freq.length ;face++ ) {
      System.out.println(face+"\t"+freq[face]);
    }
  }
}
