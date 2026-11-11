package sorts;

/** Merge sort, the recursive version. */
public final class MergeSortRecursive {

  private MergeSortRecursive() {
    // This class should not be instantiated!
  }

  // Assumes arr[start..mid-1] and arr[mid..end-1] are each sorted. Merges them
  // into one sorted range arr[start..end-1].
  private static void merge(int[] arr, int start, int mid, int end) {
    int[] merged = new int[end - start];

    int i = start, j = mid;
    for (int k = 0; k < merged.length; k++) {
      if (i >= mid) {
        merged[k] = arr[j++];
      } else if (j >= end) {
        merged[k] = arr[i++];
      } else if (arr[i] <= arr[j]) {
        merged[k] = arr[i++];
      } else {
        merged[k] = arr[j++];
      }
    }

    for (int k = 0; k < merged.length; k++) {
      arr[start + k] = merged[k];
    }
  }

  // Sorts the range arr[start..end-1].
  private static void mergeSort(int[] arr, int start, int end) {
    if (end - start <= 1) {
      return;
    }
    int mid = start + (end - start) / 2;
    mergeSort(arr, start, mid);  // sort the left half
    mergeSort(arr, mid, end);  // sort the right half
    merge(arr, start, mid, end);  // merge the two sorted halves
  }

  // Sorts arr in ascending order. Assumes arr is not null.
  public static void mergeSort(int[] arr) {
    mergeSort(arr, 0, arr.length);
  }
}
