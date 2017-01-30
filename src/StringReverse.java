public class StringReverse {
    private void reverseString(char[] str, int start, int end) {
        while (start < end) {
            char c = str[start];
            str[start++] = str[end];
            str[end--] = c;
        }
    }

    public void rotateString(char[] str, int n, int m) {
        m = m % n;
        reverseString(str, 0, m - 1);
        reverseString(str, m, n - 1);
        reverseString(str, 0, n - 1);
    }

    public static void main(String[] args) {
        char[] str = "abcde".toCharArray();
        StringReverse sReverse = new StringReverse();
        sReverse.rotateString(str, 5, 2);
        System.out.println(str);
    }
}