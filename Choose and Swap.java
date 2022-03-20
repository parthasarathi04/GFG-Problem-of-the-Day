class Solution{
    
    
    String chooseandswap(String A){
        // Code Here

        int[] count = new int[26];
        
        for(char c:A.toCharArray()) count[c-'a']++;
        
        for(int i=0;i<A.length();i++){
            if(count[A.charAt(i)-'a']==0) continue;
            
            
            char c = 'a';
            
            while(c!=A.charAt(i)){
                if(count[c-'a']>0) break;
                c++;
            }
            
            count[A.charAt(i)-'a']=0;
            
            if(c==A.charAt(i)) continue;
            
            
            char x = A.charAt(i);
            
            A = A.replaceAll(x+"", "1");
            
            A = A.replaceAll(c+"", x+"");
            
            A = A.replaceAll("1", c+"");
            
            break;
            
        }
        
        return A;

    }
    
}
