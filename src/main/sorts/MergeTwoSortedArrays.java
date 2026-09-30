package sorts;

/** The merge of two sorted arrays into a new array. */
public final class MergeTwoSortedArrays {

  private MergeTwoSortedArrays() {
    // This class should not be instantiated!
  }

  // Assumes arr1 and arr2 are each sorted. Returns a new sorted array with the
  // elements of both. On a tie, the element from arr1 comes first.
  public static int[] merge(int[] arr1, int[] arr2) {
    int[] merged = new int[arr1.length + arr2.length];
    int i = 0, j = 0;
    for (int k = 0; k < merged.length; k++) {
      if (i >= arr1.length) {
        merged[k] = arr2[j++];
      } else if (j >= arr2.length) {
        merged[k] = arr1[i++];
      } else if (arr1[i] <= arr2[j]) {
        merged[k] = arr1[i++];
      } else {
        merged[k] = arr2[j++];
      }
    }
    return merged;
  }
}
