public class MaxSubArray {
    public int maxSubArray(int[] a, int n) {
        //保存当前和
        int curSum = 0;
        //最大和
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            //加入下一个元素是否会获得更大的结果，如果更大，子数组连续，否则寻找新数组
            curSum = (a[i] > a[i] + curSum) ? a[i] : a[i] + curSum;
            //保存最大结果
            maxSum = (maxSum > curSum) ? maxSum : curSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = { 1, -5, 4, 6, -3, 9 };
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(a, 6));
    }
}