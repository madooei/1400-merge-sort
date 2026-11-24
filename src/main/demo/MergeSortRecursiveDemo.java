package demo;

import java.util.Arrays;
import sorts.MergeSortRecursive;

/** A demo of MergeSortRecursive on the example the notes trace. */
public final class MergeSortRecursiveDemo {

  private MergeSortRecursiveDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
    System.out.println("before: " + Arrays.toString(arr));

    // The left half sorts to [3, 5, 6, 8], the right half to [1, 2, 4, 7],
    // and the last merge gives [1, 2, 3, 4, 5, 6, 7, 8].
    MergeSortRecursive.mergeSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
