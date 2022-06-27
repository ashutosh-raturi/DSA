package runner;

import sorting.BubbleSort;
import sorting.SelectionSort;
import util.ArrayHelpers;

public class Main {
  public static void main(String[] args) {
    int[] arr = {56, 34, 2, 87, 23, 78, 45};
    SelectionSort obj = new SelectionSort();
    obj.sort(arr);
    ArrayHelpers.printArray(arr);
  }
}
