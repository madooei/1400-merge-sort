package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the merge of two sorted arrays into a new array. */
public class MergeTwoSortedArraysTest {

  @Test
  public void bothArraysEmpty() {
    assertElements(new int[] {},
        MergeTwoSortedArrays.merge(new int[] {}, new int[] {}));
  }

  @Test
  public void firstArrayEmpty() {
    assertElements(new int[] {1, 2, 3},
        MergeTwoSortedArrays.merge(new int[] {}, new int[] {1, 2, 3}));
  }

  @Test
  public void secondArrayEmpty() {
    assertElements(new int[] {1, 2, 3},
        MergeTwoSortedArrays.merge(new int[] {1, 2, 3}, new int[] {}));
  }

  @Test
  public void singletonsOutOfOrder() {
    assertElements(new int[] {3, 5},
        MergeTwoSortedArrays.merge(new int[] {5}, new int[] {3}));
  }

  @Test
  public void noInterleaveWhenFirstPrecedesSecond() {
    assertElements(new int[] {1, 2, 3, 4, 5, 6},
        MergeTwoSortedArrays.merge(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
  }

  @Test
  public void equalLengthsInterleave() {
    assertElements(new int[] {1, 2, 3, 4, 5, 6},
        MergeTwoSortedArrays.merge(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
  }

  @Test
  public void longerSecondArrayDrainsItsTail() {
    assertElements(new int[] {1, 2, 3, 4, 5, 6, 7},
        MergeTwoSortedArrays.merge(new int[] {1, 3, 5}, new int[] {2, 4, 6, 7}));
  }

  @Test
  public void duplicatesAcrossBothArrays() {
    assertElements(new int[] {1, 1, 1, 2, 3},
        MergeTwoSortedArrays.merge(new int[] {1, 1, 2}, new int[] {1, 3}));
  }

  // Asserts that actual holds exactly the expected elements, in order.
  private static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
