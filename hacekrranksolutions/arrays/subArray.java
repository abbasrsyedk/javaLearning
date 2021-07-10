import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner abbas = new Scanner(System.in);
    int n = abbas.nextInt();
    int arr[] = new int[n];
    for (int m = 0; m < n; m++) {
      arr[m] = abbas.nextInt();
      // System.out.print(arr[m]);
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          // System.out.print(arr[j]+" ");
          sum += arr[k];
        }
        // System.out.println();
        // System.out.println(sum);
        if (0 > sum) {
          // System.out.print(sum+" ");
          count += 1;
        }
        // System.out.println();
      }
    }
    System.out.print(count);
  }
}
