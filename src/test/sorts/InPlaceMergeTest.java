package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the in-place merge of the two sorted halves of one array. */
public class InPlaceMergeTest {

  @Test
  public void emptyArrayStaysEmpty() {
    int[] arr = {};
    InPlaceMerge.merge(arr, 0);
    assertElements(new int[] {}, arr);
  }

  @Test
  public void leftHalfEmptyLeavesArrayUnchanged() {
    int[] arr = {1, 2};
    InPlaceMerge.merge(arr, 0);
    assertElements(new int[] {1, 2}, arr);
  }

  @Test
  public void rightHalfEmptyLeavesArrayUnchanged() {
    int[] arr = {5};
    InPlaceMerge.merge(arr, 1);
    assertElements(new int[] {5}, arr);
  }

  @Test
  public void twoElementsInOrder() {
    int[] arr = {1, 2};
    InPlaceMerge.merge(arr, 1);
    assertElements(new int[] {1, 2}, arr);
  }

  @Test
  public void twoElementsOutOfOrder() {
    int[] arr = {2, 1};
    InPlaceMerge.merge(arr, 1);
    assertElements(new int[] {1, 2}, arr);
  }

  @Test
  public void alreadyMergedHalvesAreUnchanged() {
    int[] arr = {1, 2, 3, 4};
    InPlaceMerge.merge(arr, 2);
    assertElements(new int[] {1, 2, 3, 4}, arr);
  }

  @Test
  public void interleavedHalvesMerge() {
    int[] arr = {1, 3, 2, 4};
    InPlaceMerge.merge(arr, 2);
    assertElements(new int[] {1, 2, 3, 4}, arr);
  }

  @Test
  public void rightHalfAllSmallerMovesToTheFront() {
    int[] arr = {3, 4, 1, 2};
    InPlaceMerge.merge(arr, 2);
    assertElements(new int[] {1, 2, 3, 4}, arr);
  }

  @Test
  public void unevenHalvesMerge() {
    int[] arr = {2, 3, 5, 1, 4, 6, 7};
    InPlaceMerge.merge(arr, 3);
    assertElements(new int[] {1, 2, 3, 4, 5, 6, 7}, arr);
  }

  // Asserts that actual holds exactly the expected elements, in order.
  private static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
