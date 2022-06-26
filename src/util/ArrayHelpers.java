package util;

public class ArrayHelpers {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "-");
        }
        System.out.print("end\n");
    }

    public static void swap(int [] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
