class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        Fun(ans, n, 0, 0, "");
        return ans;
    }

    public void Fun(List<String> ans, int n, int open, int close, String s){
        if(s.length() == n*2){
            ans.add(s);
            return;
        }
        if(open<n) Fun(ans, n, open+1, close, s+"(");
        if(close<open) Fun(ans, n, open, close+1, s+")");
    }
}