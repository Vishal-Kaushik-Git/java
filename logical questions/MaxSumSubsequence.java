import java.util.Arrays;

public class MaxSumSubsequence {
    public static int maxSumSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            for (int j = Math.max(0, i - k); j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + nums[i]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 2;

        int result = maxSumSubsequence(nums, k);
        System.out.println("Maximum sum: " + result);
    }
}
