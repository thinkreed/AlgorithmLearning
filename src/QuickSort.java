public class QuickSort {

  public void sort(int[] a) {
    if (a == null || a.length == 0) {
      return;
    }
    quickSort(a, 0, a.length - 1);
  }

  private void quickSort(int[] a, int low, int high) {
    int i = low;
    int j = high;
    int pivot = a[low + ((high - low) >> 1)];
    while (i <= j) {
      while (a[i] < pivot) {
        i++;
      }
      while (a[j] > pivot) {
        j--;
      }
      if (i <= j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
      }
    }
    if (low < j) {
      quickSort(a, low, j);
    }
    if (high > i) {
      quickSort(a, i, high);
    }
  }

  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    int[] a = { 6, 1, 27, 9, 3, 4, 5, 10, 8 };
    qs.sort(a);
    for (int i : a) {
      System.out.print(i);
      System.out.print(" ");
    }
  }
}
