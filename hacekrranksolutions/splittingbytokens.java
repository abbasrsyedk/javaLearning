import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    int count = 0;
    // for(int j=0; j<s.length(); j++){
    //     if(s.charAt(i)== ','||s.charAt(i)== '?'||s.charAt(i)== '.'||s.charAt(i)=='_'||s.charAt(i)== ' '||s.charAt(i)== '@'||s.charAt(i)== "'"){
    //         count++;
    //     }
    // }
    // System.out.print(count);
    s = s.trim();
    String[] tokens = s.split("[ !,?.\\_'@]+");
    System.out.println(tokens.length);
    for (int i = 0; i < tokens.length; i++) {
      System.out.println(tokens[i]);
    }
    scan.close();
  }
}
