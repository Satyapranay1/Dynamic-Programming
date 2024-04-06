class Solution {
    public int maxProduct(int[] nums) {
        int curr = 1,max = Integer.MIN_VALUE,n = nums.length;
        for (int i = 0; i < n; i++){
            curr *= nums[i];
            max = Math.max(max,curr);

            if (curr == 0){
                curr = 1;
            }
        }

        curr = 1;
        for (int i = n - 1; i >= 0; i--){
            curr  *= nums[i];
            max = Math.max(max,curr);
            if (curr == 0){
                curr = 1;
            }
        }
        return max;
    }
}