package runner;

import searching.Search;
import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;
import util.ArrayHelpers;

public class Main {
  public static void main(String[] args) {
    int[] arr = {56, 34, 2, 87, 23, 78, 45};
    Search find = new Search();
    System.out.println(find.linearSearch(arr, 87));
    InsertionSort obj = new InsertionSort();
    obj.sort(arr);
    ArrayHelpers.printArray(arr);
    System.out.println(find.binarySearch(arr, 45));
  }
}
