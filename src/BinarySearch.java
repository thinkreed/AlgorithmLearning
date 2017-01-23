public class BinarySearch {

  public int binarySearch(int[] a, int n, int value) {
    int left = 0;
    int right = n - 1;
    int middle = 0;
    while (left <= right) {
      middle = left + ((right - left) >> 1);
      if (a[middle] > value) {
        right = middle - 1;
      } else if (a[middle] < value) {
        left = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = { 1, 3, 5, 7, 9 };
    BinarySearch bs = new BinarySearch();
    int res = bs.binarySearch(a, 5, 5);
    System.out.println(res);
  }
}
