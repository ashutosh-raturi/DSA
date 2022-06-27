package sorting;

import util.ArrayHelpers;

public class SelectionSort {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int pos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          pos = j;
        }
      }
      ArrayHelpers.swap(arr, i, pos);
    }
  }
}
