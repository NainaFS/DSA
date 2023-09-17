class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int sum_index=0, sum_arr=0;
        for(int i=0; i< arr.length; i++){
            sum_index+=i;
            sum_arr+=arr[i];
            if(sum_index==sum_arr){
                count++;
                sum_index=0;
                sum_arr=0;
            }
        }
        return count;
    }
}