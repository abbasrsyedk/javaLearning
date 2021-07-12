import java.util.*;

public class enhancedfor {

  public static void main(String[] args) {
    //create an array
    int arr[] = { 542, 354, 345, 654 };
    // //instead of this
    // for(int i=0;i<4;i++){
    //     System.out.print(arr[i]);
    // }
    //we do this
    for (int i : arr) {
      System.out.print(i);
    }
  }
}
