class reversenumber {

  public int numberReverse(int num) {
    int reverse = 0;
    while (num != 0) {
      reverse = (reverse * 10) + (num % 10);
      num = num / 10;
    }
    return reverse;
  }

  public static void main(String args[]) {
    reversenumber n1 = new reversenumber();
    System.out.print("reversed number :" + n1.numberReverse(24813));
  }
}
