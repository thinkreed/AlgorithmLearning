public class FindTwoSum {

    public void findTwoSum(int[] a, int n, int sum) {
        int left = 0;
        int right = n - 1;
        int curSum = 0;
        while (left < right) {
            curSum = a[left] + a[right];
            if (curSum > sum) {
                right--;
            } else if (curSum < sum) {
                left++;
            } else {
                System.out.print(a[left]);
                System.out.print(" ");
                System.out.print(a[right]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9, 11 };
        FindTwoSum fts = new FindTwoSum();
        fts.findTwoSum(a, 6, 8);
    }
}