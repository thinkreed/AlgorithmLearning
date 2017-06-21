public class FindTwoSum {

    public void findTwoSum(int[] a, int n, int sum) {
        int left = 0;
        int right = n - 1;
        int curSum = 0;

        //当left >= right，两个指标相遇，说明a数组中不存在和为sum的两个数
        while (left < right) {
            //计算当前和
            curSum = a[left] + a[right];
            //过大，减小一些
            if (curSum > sum) {
                right--;
            } else if (curSum < sum) { //太小，大一些
                left++;
            } else { //刚好，返回
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