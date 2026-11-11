package sorts;

/** Runs the merge sort scenarios against the bottom-up version. */
public class MergeSortBottomUpTest extends MergeSortTest {

  @Override
  protected void mergeSort(int[] arr) {
    MergeSortBottomUp.mergeSort(arr);
  }
}
