class Solution {
    public int longestNiceSubarray(int[] nums) {
        int num=0;
        int j=0;
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if((num & nums[i])!=0){
                while((num & nums[i])!=0){
                    num=num^nums[j];
                    j++;
                }
            }
            num = num | nums[i];
            ans=Math.max(ans, i-j+1);
        }
        return ans;
    }
}