public class twoDarray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = sc.nextInt();
        // System.out.print(arr[i][j]+" ");
      }
      // System.out.println();
    }
    //input over
    //putout
    int sum = 0;
    int temp = 0;
    int c = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        sum =
          arr[i][j] +
          arr[i][j + 1] +
          arr[i][j + 2] +
          arr[i + 1][j + 1] +
          arr[i + 2][j] +
          arr[i + 2][j + 1] +
          arr[i + 2][j + 2];
        if (c < 1) {
          temp = sum;
          c++;
        }
        if (sum > temp) {
          temp = sum;
        }
      }
    }
    System.out.print(temp);
  }
}
