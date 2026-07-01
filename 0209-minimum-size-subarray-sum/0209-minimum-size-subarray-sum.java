class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int h  = 0, l = 0 , sum = 0;
        int minLen = Integer.MAX_VALUE;

        while(h < nums.length){
            sum = sum + nums[h];

            while (sum >= target){
                minLen = Math.min(minLen , h-l+1);
                sum = sum - nums[l];
                l++;
            }
            h++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen ;
        
    }
}