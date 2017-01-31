public class StringContain {
    public boolean stringContain(char[] str1, char[] str2) {
        int hash = 0;
        for (int i = 0; i < str1.length; i++) {
            hash |= (1 << (str1[i] - 'a'));
        }
        for (int i = 0; i < str2.length; i++) {
            if ((hash & (1 << (str2[i] - 'a'))) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] str1 = "abcde".toCharArray();
        char[] str2 = "ddd".toCharArray();
        StringContain sContain = new StringContain();
        System.out.println(sContain.stringContain(str1, str2));
    }
}