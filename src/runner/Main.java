package runner;

import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;
import util.ArrayHelpers;

public class Main {
  public static void main(String[] args) {
    int[] arr = {56, 34, 2, 87, 23, 78, 45};
    InsertionSort obj = new InsertionSort();
    obj.sort(arr);
    ArrayHelpers.printArray(arr);
  }
}
