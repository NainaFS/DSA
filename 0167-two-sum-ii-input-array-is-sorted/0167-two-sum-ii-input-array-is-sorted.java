class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length -1;
        int[] res = new int[]{0,0};
        while(low<=high){
            if(numbers[low]+numbers[high]<target) low = low+1;
            else if(numbers[low] + numbers[high]>target) high = high-1;
            else {
                res[0]=low+1;
                res[1]=high+1;
                return res;
            }
        }
        return res;
        
    }
}