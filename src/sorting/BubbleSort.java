package sorting;

import util.ArrayHelpers;

public class BubbleSort {
  private static void sort(int[] arr) {
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

  public static void main(String[] args) {
    int[] arr = {12, 43, 65, 87, 98, 23, 54, 34, 89};
    sort(arr);
    ArrayHelpers.printArray(arr);
  }
}
