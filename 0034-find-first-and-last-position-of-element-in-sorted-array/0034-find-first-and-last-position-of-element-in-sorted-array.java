class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int[] response = new int[]{-1,-1};
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                response[0]=mid;
                high=mid-1;
            } else if(nums[mid]<target) {
                low = mid+1;
            } else {
                high =mid-1;
            }
        }
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                response[1]=mid;
                low=mid+1;
            } else if(nums[mid]<target){
                low=mid+1;
            } else {
                high = mid-1;
            }
        }
        return response;
    }
}