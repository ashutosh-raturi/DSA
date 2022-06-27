package runner;

import sorting.BubbleSort;
import util.ArrayHelpers;

public class Main {
  public static void main(String[] args) {
    int[] arr = {56, 87, 34, 2, 87, 23, 78, 45};
    BubbleSort obj = new BubbleSort();
    obj.sort(arr);
    ArrayHelpers.printArray(arr);
  }
}
