package sorts;

/** The merge of the two sorted halves of one array, in place. */
public final class InPlaceMerge {

  private InPlaceMerge() {
    // This class should not be instantiated!
  }

  // Assumes arr[0..mid-1] and arr[mid..arr.length-1] are each sorted. Sorts arr
  // in place, without an auxiliary array.
  public static void merge(int[] arr, int mid) {
    for (int k = 0; k < mid && mid < arr.length; k++) {
      // if the current element is larger than the first element of the second
      // half, we need to move arr[mid] to arr[k], and shift everything from
      // arr[k] to arr[mid - 1] to the right
      if (arr[k] > arr[mid]) {
        int temp = arr[mid];
        for (int i = mid; i > k; i--) {
          arr[i] = arr[i - 1];
        }
        arr[k] = temp;
        mid++;  // the boundary between the two sorted halves moves right after each insertion
      }
    }
  }
}
