package searching;

public class Search {

  public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) return i;
    }
    return -1;
  }

  public int binarySearch(int[] arr, int target) {
    int l = 0;
    int h = arr.length - 1;
    while (l <= h) {
      int mid = l + (h - l) / 2;
      if (arr[mid] == target) return mid;
      if (target < arr[mid]) h = mid - 1;
      else l = mid + 1;
    }
    return -1;
  }
}
