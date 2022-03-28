class Solution{
    
    int swapBits(int x, int p1, int p2, int n)
    {
        for(int i=0; i<n; i++)
        {
            
            int temp1 = (x>>p1)&1;
            int temp2 = (x>>p2)&1;
            
            
            x = x&(~(1<<p1));
            x = x&(~(1<<p2));
            
            
            x = x | (temp1<<p2);
            x = x | (temp2<<p1);
            
            
            p1++;
            p2++;
            
        }
        
        return x;
    }
}
