public class StringReverse {
    private void reverseString(char[] str, int start, int end) {
        while (start < end) {
            char c = str[start];
            str[start++] = str[end];
            str[end--] = c;
        }
    }

    /*
    假设字符串由XY两部分组成,定义X翻转后为X^T，Y翻转为Y^T，那么可得(X^TY^T)^T=YX字符串成功旋转
    */
    public void rotateString(char[] str, int n, int m) {
        m = m % n;
        //翻转前m个
        reverseString(str, 0, m - 1);
        //翻转后m-n个
        reverseString(str, m, n - 1);
        //整体翻转
        reverseString(str, 0, n - 1);
    }

    public static void main(String[] args) {
        char[] str = "abcde".toCharArray();
        StringReverse sReverse = new StringReverse();
        sReverse.rotateString(str, 5, 2);
        System.out.println(str);
    }
}