public class Fibonacci {
  public int fibonacci(int n) {
    int[] dp = { 1, 1, 0 };
    if (n < 2) {
      return 1;
    }
    for (int i = 2; i <= n; i++) {
      dp[2] = dp[0] + dp[1];
      dp[0] = dp[1];
      dp[1] = dp[2];
    }
    return dp[2];
  }

  public static void main(String[] args) {
    Fibonacci fb = new Fibonacci();
    for (int i = 0; i < 10; i++) {
      System.out.print(fb.fibonacci(i));
      System.out.print(" ");
    }

  }
}
