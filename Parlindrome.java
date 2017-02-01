public class Parlindrome {
    public boolean parlindrome(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            if (str[i] != str[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Parlindrome parlindrome = new Parlindrome();
        System.out.println(parlindrome.parlindrome("stttttss".toCharArray()));
    }
}