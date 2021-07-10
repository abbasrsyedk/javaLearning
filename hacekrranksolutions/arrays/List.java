import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner abbas = new Scanner(System.in);
    int N = abbas.nextInt();
    List<Integer> L = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      int a = abbas.nextInt();
      L.add(i, a);
    }
    //no of queries
    int Q = abbas.nextInt();

    for (int i = 0; i < Q; i++) {
      // String b = "Insert";
      // String c = "Delete";
      String f = abbas.next();
      //i made a mistake by using nextLine() here
      if (f.equals("Insert")) {
        int x = abbas.nextInt();
        int y = abbas.nextInt();
        L.add(x, y);
        //add(index,value)

      } else if (f.equals("Delete")) {
        int x = abbas.nextInt();
        L.remove(x);
        //remove(index)
      }
    }

    int size = L.size();
    // System.out.println(size);
    for (int i = 0; i < size; i++) {
      System.out.print(L.get(i) + " ");
    }
  }
}
