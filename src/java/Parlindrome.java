public class Parlindrome {
    public boolean parlindrome(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        //指向头，尾
        int i = 0;
        int j = str.length - 1;
        //当指针相遇则是回文
        while (i < j) {
            //如果头尾所指不同，则不是回文
            if (str[i] != str[j]) {
                return false;
            }
            //向中间靠拢
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