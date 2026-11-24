package demo;

import java.util.Arrays;
import sorts.MergeSortBottomUp;

/** A demo of MergeSortBottomUp on the example the notes trace. */
public final class MergeSortBottomUpDemo {

  private MergeSortBottomUpDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {6, 5, 2, 0, 9, 1, 3};
    System.out.println("before: " + Arrays.toString(arr));

    // Runs of width 1, 2, and 4 merge into [0, 1, 2, 3, 5, 6, 9].
    MergeSortBottomUp.mergeSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
