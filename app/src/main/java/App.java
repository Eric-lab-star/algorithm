/*
 * This source file was generated by the Gradle 'init' task
 */

import java.util.Arrays;
import search.Binary;

public class App {
  public static void main(String[] args) {
    int out = Binary.run(1);
    System.out.println(out);
    int[] randNumber = {4, 78, 1, 75, 13};
    Arrays.sort(randNumber);
    System.out.println(Arrays.toString(randNumber));
  }
}
