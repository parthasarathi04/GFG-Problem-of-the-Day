class Solution
{
    private long[] fact;
    
    private void f(){
        
        fact[0] = fact[1] = 1;
        
        for(int i=2;i<20;i++) fact[i] = i*fact[i-1];
    }
    
    
    public long findRank(String S)
    {
        // Code here
        fact = new long[20];
        
        f();
        

        int[] count = new int[26];
        
        for(char c:S.toCharArray()) count[c-'a']++;
        
        long ans = 1;
        
        
        for(int i=0;i<S.length();i++){
            
            int c = S.charAt(i) - 'a';
            
            int z = 0;
            
            for(int j=0;j<c;j++) z+=count[j];
            
            ans += z * fact[S.length() - i - 1];
            
            count[c]--;
            
        }
        
        return ans;
        
        
    }
}
