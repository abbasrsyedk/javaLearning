class Calc {

  // ... is varargs
  public int add(int... i) {
    int sum = 0;
    for (int k : i) {
      sum = sum + k;
    }
    return sum;
  }
}

public class varargs {

  public static void main(String[] args) {
    Calc obj = new Calc();
    System.out.print(obj.add(4, 5, 5, 6, 7, 8, 9));
  }
}
