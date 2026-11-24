package demo;

import java.util.Arrays;
import sorts.MergeTwoSortedArrays;

/** A demo of MergeTwoSortedArrays on the notes' example. */
public final class MergeTwoSortedArraysDemo {

  private MergeTwoSortedArraysDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5};
    int[] arr2 = {2, 4, 6, 7};
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));

    // Expect [1, 2, 3, 4, 5, 6, 7].
    int[] merged = MergeTwoSortedArrays.merge(arr1, arr2);
    System.out.println("merged: " + Arrays.toString(merged));
  }
}
