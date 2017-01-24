
import java.util.ArrayList;

/**
 * ZeroOneKnapsack
 */
public class ZeroOneKnapsack {

    private java.util.List<Integer> mList;

    public ZeroOneKnapsack() {
        this.mList = new ArrayList<>();
    }

    public void zeroOneKnapsack(int n, int sum) {
        if (n <= 0 || sum <= 0) {
            return;
        }
        if (sum == n) {
            for (int i : mList) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(n);
        }
        mList.add(n);
        zeroOneKnapsack(n - 1, sum - n);
        mList.remove(mList.size() - 1);
        zeroOneKnapsack(n - 1, sum);
    }

    public static void main(String[] args) {
        ZeroOneKnapsack zKnapsack = new ZeroOneKnapsack();
        zKnapsack.zeroOneKnapsack(5, 14);
    }
}