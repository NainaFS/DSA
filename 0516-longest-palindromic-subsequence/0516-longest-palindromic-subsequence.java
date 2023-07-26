class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String s1="";
        int[][] dp = new int[n+1][n+1];
        for(int i=n-1; i>=0; i--){
            s1+=s.charAt(i)+"";
        }
        for(int k=1; k<n+1; k++){
            for(int j =1; j<n+1; j++){
                if(s.charAt(k-1) == s1.charAt(j-1)){
                    dp[k][j]=dp[k-1][j-1]+1;
                } else {
                    dp[k][j]=Math.max(dp[k][j-1], dp[k-1][j]);
                }
            }
        }
        return dp[n][n];
    }
}