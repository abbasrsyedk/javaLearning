import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    System.out.println(n);
    for (int i = 0; i < n; i++) {
      int d = sc.nextInt();
      System.out.print(d);
      // arr = new ArrayList<Integer>;
      for (int j = 0; j < d; j++) {
        int k = sc.nextInt();
        arr.add(k);
        // System.out.print(arr[i][j]);
      }
      // System.out.println();
    }
    //queries
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = arr.get(x, y);
      System.out.print(z);
    }
  }
}
