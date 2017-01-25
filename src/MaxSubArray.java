public class MaxSubArray {
    public int maxSubArray(int[] a, int n) {
        int curSum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            curSum = (a[i] > a[i] + curSum) ? a[i] : a[i] + curSum;
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