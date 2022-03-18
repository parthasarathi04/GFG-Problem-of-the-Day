class Solution{
    
    private static final long mod = (long) 1e9+7;
    
    private static long[][] dp;
    
    private static long fun(int N, int K, int X){
        
        if(N == 0) return 1;
        
        if(dp[N][K] != -1) return dp[N][K];
        
        long ans = 0;
        
        if(K > 0) ans = (ans%mod + (5*fun(N-1, K-1, X)%mod)%mod) % mod;
        
        ans = (ans%mod + (21*fun(N-1, X, X)%mod)%mod) % mod;
        
        return dp[N][K] = ans;
    }
    
    
    
    public int kvowelwords(int N,int K){
        dp = new long[N+1][K+1];
        
        for(int i=0;i<=N;i++) Arrays.fill(dp[i], (long) -1);
        
        
        return (int) fun(N, K, K);
    }
}
