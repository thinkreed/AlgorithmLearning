public class Josephus {
    public int josephus(int n, int m) {
        int s = 0;
        for (int i = 2; i <= n; i++) {
            //每轮出局的人的序号
            s = (s + m) % i;
        }
        //编号1开始
        return s + 1;
    }

    public static void main(String[] args) {
        System.out.println(new Josephus().josephus(15, 3));
    }
}