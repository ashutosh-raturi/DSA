package sorting;

import util.ArrayHelpers;

public class BubbleSort {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean isSwapped = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          ArrayHelpers.swap(arr, j, j - 1);
          isSwapped = true;
        }
      }
      if (!isSwapped) break;
    }
  }
}
