class Solution{
    
   
    public static ArrayList<Integer> maxProductSubsequence (int arr[], int n) {
        //Complete the function
    
        ArrayList<Integer> list = new ArrayList<>();
        
        long ans = -1;
        
        int x = -1, y = -1, z = -1;
        
        
        int[] right = new int[n];
        
        right[n-1] = arr[n-1];
        
        
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=1;i<n-1;i++){
            Integer p = set.lower(arr[i]);
            long q = right[i];
            
            if(p!=null && q!=arr[i]){
                long r = ((long)p)*q*((long)arr[i]);
                if(r>ans){
                    ans = r;
                    x = p;
                    y = arr[i];
                    z = (int)q;
                }
            }
            
            set.add(arr[i]);
        }
        
        if(ans==-1){
            list.add(-1);
        }
        else{
            list.add(x);
            list.add(y);
            list.add(z);
        }
        
        return list;
    }
    
    
}

