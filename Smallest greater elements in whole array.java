class Complete{
    
    private static class P implements Comparable<P>{
       
        int x,y;
       
        P(int a,int b){
            x = a;
            y = b;
        }
        
        @Override
        public int compareTo(P p){
            return x - p.x;
        }
       
    }
   
   
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
        // Complete the function
        final int none = (int) - 1e7 ;
        
        
        P[] a = new P[n];
        
        for(int i=0;i<n;i++){
            a[i] = new P(arr[i],i);
        }
        
        Arrays.sort(a);
        
        
        int[] ans = new int[n];
        
        ans[a[n-1].y] = none;
        
        for(int i=n-2;i>=0;i--){
            if(a[i].x == a[i+1].x){
                ans[a[i].y] = ans[a[i+1].y];
            }
            else{
                ans[a[i].y] = a[i+1].x;
            }
        }
        
        
        return ans;
    }
    
    
}


