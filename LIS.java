class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    if (dp[i] <= dp[j] + 1){
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if (max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}