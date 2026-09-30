package sorts;

/** Merge sort, in a bottom-up version and a recursive version. */
public final class MergeSort {

  private MergeSort() {
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

  // Sorts arr in ascending order. Assumes arr is not null.
  public static void mergeSortBottomUp(int[] arr) {
    int n = arr.length;
    for (int width = 1; width < n; width *= 2) {
      for (int start = 0; start < n; start += 2 * width) {
        int mid = Math.min(start + width, n);
        int end = Math.min(start + 2 * width, n);
        merge(arr, start, mid, end);
      }
    }
  }

  // Sorts the range arr[start..end-1].
  private static void mergeSortRecursive(int[] arr, int start, int end) {
    if (end - start <= 1) {
      return;
    }
    int mid = start + (end - start) / 2;
    mergeSortRecursive(arr, start, mid);  // sort the left half
    mergeSortRecursive(arr, mid, end);  // sort the right half
    merge(arr, start, mid, end);  // merge the two sorted halves
  }

  // Sorts arr in ascending order. Assumes arr is not null.
  public static void mergeSortRecursive(int[] arr) {
    mergeSortRecursive(arr, 0, arr.length);
  }
}
