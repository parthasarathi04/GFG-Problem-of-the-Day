class Solution {
    static int minSteps(int[] A, int N, int K) {
        // code here
        Arrays.sort(A);
        
        int[] suf = new int[N];
        
        suf[N-1] = A[N-1];
        
        for(int i=N-2;i>=0;i--) suf[i] = A[i]+suf[i+1];
        
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            
            int x = A[i]+K;
            
            int l = i+1, r = N-1;
            
            int z = N;
            
            while(l<=r){
                int m = l+(r-l)/2;
                
                if(A[m]<=x) l = m+1;
                else{
                    z = m;
                    r = m-1;
                }
            }
            
            ans = Math.min(ans, suf[0]-suf[i]+ (z<N ? (suf[z]-x*(N-z)) : 0)); 
            
        }
        
        return ans;
    }
};
