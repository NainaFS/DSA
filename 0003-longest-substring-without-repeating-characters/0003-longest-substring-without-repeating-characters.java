class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
         int start = -1;
         Map<Character, Integer> map = new HashMap<>();
         for(int i=0; i< s.length(); i++){
             if(!map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i),-1);
             }
             start = Math.max(start, map.get(s.charAt(i)));
             map.put(s.charAt(i),i);
             ans = Math.max(ans, i-start);
         }
         return ans;
    }
}