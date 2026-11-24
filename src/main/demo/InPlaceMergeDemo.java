package demo;

import java.util.Arrays;
import sorts.InPlaceMerge;

/** A demo of InPlaceMerge on the example the notes trace. */
public final class InPlaceMergeDemo {

  private InPlaceMergeDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 1, 4, 6, 7};
    int mid = 3;
    System.out.println("before: " + Arrays.toString(arr) + ", mid = " + mid);

    // The halves [2, 3, 5] and [1, 4, 6, 7] merge into [1, 2, 3, 4, 5, 6, 7].
    InPlaceMerge.merge(arr, mid);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
