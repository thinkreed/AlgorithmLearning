public class OddEvenSort {
    private boolean isOdd(int value) {
        return (value & 1) == 1;
    }

    public void oddEvenSort(int[] a, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (isOdd(a[i])) {
                i++;
            }
            while (!isOdd(a[j])) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 5, 7 };
        OddEvenSort oSort = new OddEvenSort();
        oSort.oddEvenSort(a, 6);
        for (int value : a) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}