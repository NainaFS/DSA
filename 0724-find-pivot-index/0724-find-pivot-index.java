class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int lsum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        for(int i =0; i<nums.length; i++){
            sum -= nums[i];
            if(sum == lsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}