package search;

import java.util.Arrays;

/**
 * binary
 */
public class Binary {
  public static int[] number = {1, 2, 3, 4, 5};
  public static int[] numbers = {1, 2};
  public void print() {
    System.out.println("this is binary");
  }

  public static int run(int key) {
    int pl = 0;
    int pr = Binary.number.length - 1;

    do {
      int pc = (pl + pr) / 2;
      if (number[pc] == key) {
        return pc;
      } else if (key < number[pc]) {
        pr = pc - 1;
      } else {
        pl = pc + 1;
      }

    } while (pl <= pr);

    return -1;
  }
}
