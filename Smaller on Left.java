class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        
        int[] ans = new int[n];
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < n; i++){
            
            Integer val = set.lower(arr[i]);
            
            ans[i] = val == null ? -1 : val;
            
            set.add(arr[i]);
            
        }
        
        return ans;
        
    }
    
    
}
