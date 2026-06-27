class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0 , h = l+1 , c = 1 ;

        while (h < nums.length){
            if (nums [h] == nums[h-1]){
                h++;
                continue;
            }
            else {
                nums[l+1]=nums[h];
                l++;
                c++;
                h++;
            }
        }
        return c;
    }
}
