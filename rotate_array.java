import java.util.*;
public class Main {
  // Function to Reverse the array
  public static void Reverse(int[] arr, int i, int j) {
    while (i <= j) {
      int temp = arr[i];
      arr[j] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
  // Function to Rotate k elements to right
  public static void Rotateright(int[] arr, int n, int k) {
    // Reverse first n-k elements
    Reverse(arr, 0, n - k - 1);
    // Reverse last k elements
    Reverse(arr, n - k, n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    Rotateright(arr, n, k);
    System.out.print("After Rotating the k elements to right ");
    for (int m = 0; m < n; m++)
      System.out.print(arr[m] + " ");
    System.out.println();
  }
}
