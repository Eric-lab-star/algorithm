package search;

import java.util.Arrays;

/**
 * binary
 */
public class Binary {
  public static int[] numbers = {1, 2, 3, 4, 5, 6};
  public static void search(int key) {
    int pl = 0;
    int pr = numbers.length - 1;
    do {
      int pc = (pl + pr) / 2;
      if (numbers[pc] == key) {
        System.out.println(pc);
        return;
      } else if (numbers[pc] < key) {
        pl = pc + 1;
      } else {
        pr = pc - 1;
      }
    } while (pl <= pr);
    System.out.println("not found");
  }

  public static void search2(int key) {
    int res = Arrays.binarySearch(numbers, key);
    System.out.println(res);
  }
}
