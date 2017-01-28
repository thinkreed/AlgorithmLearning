public class PerfectShuffle {
    public void perfectShuffle(int[] a, int n) {
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            b[(2 * i) % (n + 1)] = a[i];
        }
        for (int i = 1; i <= n; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        PerfectShuffle pShuffle = new PerfectShuffle();
        pShuffle.perfectShuffle(a, 8);
        for (int value : a) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}