public class MaximumPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 10, 2, 0, 20, 4},
            {1, 0, 0, 30, 2, 5},
            {0, 10, 4, 0, 2, 0},
            {1, 0, 2, 20, 0, 4}
        };

        int maxSum = maxPathSum(matrix);
        System.out.println("Maximum path sum is: " + maxSum); 
    }

    public static int maxPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

       
        dp[0][0] = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j] + matrix[i][j + 1]);
                }
                if (i + 1 < m) {
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + matrix[i + 1][j]);
                }
                if (i + 1 < m && j + 1 < n) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + matrix[i + 1][j + 1]);
                }
            }
        }

        int maxSum = dp[m - 1][0];
        for (int j = 1; j < n; j++) {
            maxSum = Math.max(maxSum, dp[m - 1][j]);
        }

        return maxSum;
    }
}
