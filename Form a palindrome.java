class Solution{
    int findMinInsertions(String S){
        // code here
        StringBuilder sb = new StringBuilder(S);
        sb.reverse();
        String R = sb.toString();
        
        int n = S.length();
        
        int dp[][] = new int[n+1][n+1];
        
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return n - lcs(S, R, n, n, dp);
        
    }
    
    int lcs(String s1 , String s2 , int i , int j , int dp[][]){
        
        if(i==0 || j==0)
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];
            
        if(s1.charAt(i-1) == s2.charAt(j-1))
            return dp[i][j] = lcs(s1, s2, i-1, j-1, dp) +1 ;
        
        else
            return dp[i][j] = Math.max(lcs(s1, s2, i-1, j, dp), lcs(s1, s2, i, j-1, dp));
            
    }
}
