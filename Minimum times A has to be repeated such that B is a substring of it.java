class Solution {
    static int minRepeats(String A, String B) {
        // code here
        
        int x = B.length()/A.length();
        
        String s = "";
        
        for(int i=0;i<x;i++) s+=A;
        
        if(s.contains(B)) return x;
        
        s+=A;
        
        if(s.contains(B)) return x+1;
        
        return -1;
        
    }
};
