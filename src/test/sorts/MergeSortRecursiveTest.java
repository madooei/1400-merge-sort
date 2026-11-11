package sorts;

/** Runs the merge sort scenarios against the recursive version. */
public class MergeSortRecursiveTest extends MergeSortTest {

  @Override
  protected void mergeSort(int[] arr) {
    MergeSortRecursive.mergeSort(arr);
  }
}
