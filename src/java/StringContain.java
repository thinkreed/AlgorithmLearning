public class StringContain {
    public boolean stringContain(char[] str1, char[] str2) {
        int hash = 0;
        //取得一个str1的签名，用一个或运算，所有特征位置一
        for (int i = 0; i < str1.length; i++) {
            hash |= (1 << (str1[i] - 'a'));
        }
        //对str2的每一位进行与运算比对
        for (int i = 0; i < str2.length; i++) {
            //如果与运算为0说明并没有相应特征位，不包含
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