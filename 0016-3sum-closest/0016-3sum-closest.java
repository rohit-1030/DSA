class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);

        int resultSum = nums[0] + nums[1] + nums[2] ;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0 ; i < nums.length-2 ; i++ ){
            int l = i + 1 , r = nums.length - 1;

            while (l < r){
                int sum = nums[i] + nums[l] + nums[r] ;

                if (sum == target){
                    return target;
                }
                else if(sum < target){
                    l ++ ;
                }
                else {
                    r -- ;
                }

                int diffToTarget = Math.abs(sum - target);
                if(diffToTarget < minDiff){
                    resultSum = sum ;
                    minDiff = diffToTarget ;
                }

            }
        }
        return resultSum;        
    }
}