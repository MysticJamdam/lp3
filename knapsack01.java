import java.util.Scanner;
public class knapsack01 {

    private static int calc(int[] wt, int[] val, int W){
        int[] dp = new int[W+1];
        for(int i = 1; i <= wt.length;i++){
            for(int j = W; j >= wt[i-1]; j--){
                dp[j] = Math.max(dp[j], dp[j - wt[i-1]] + val[i-1]);
            }
        }
        return dp[W];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Weight: ");
            wt[i] = sc.nextInt();
            System.out.println("Value: ");
            val[i] = sc.nextInt();
        }
        System.out.println("Enter max weight: ");
        int W = sc.nextInt();
        int res = calc(wt, val, W);
        System.out.println(res);
        sc.close();
    }
}
