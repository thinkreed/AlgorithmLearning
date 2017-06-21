public class DutchNationalFlag {

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public void dutchNationalFlag(int[] a, int n) {
        //红色游标
        int left = 0;
        //蓝色游标
        int right = n - 1;
        //白色游标
        int cur = 1;
        while (cur <= right) {
            if (a[cur] == 0) { //红色
                swap(a, left, cur);
                left++;
            } else if (a[cur] == 1) { //白色
                cur++;
            } else { //蓝色
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