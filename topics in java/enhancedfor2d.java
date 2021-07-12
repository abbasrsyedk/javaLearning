public class enhancedfor2d {

  public static void main(String[] args) {
    int d[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4 } };
    // d contains arrays so k[] has to be an array
    //for storing arrays we need an array k
    for (int k[] : d) {
      //for printing every element
      for (int i : k) {
        System.out.print(i);
      }
    }
  }
}
