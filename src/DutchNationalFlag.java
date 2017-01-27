public class DutchNationalFlag {

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public void dutchNationalFlag(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int cur = 1;
        while (cur <= right) {
            if (a[cur] == 0) {
                swap(a, left, cur);
                left++;
            } else if (a[cur] == 1) {
                cur++;
            } else {
                swap(a, cur, right);
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 2, 2, 2, 0, 0, 0, 1, 1 };
        DutchNationalFlag dFlag = new DutchNationalFlag();
        dFlag.dutchNationalFlag(a, a.length);
        for (int value : a) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}