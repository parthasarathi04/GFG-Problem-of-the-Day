class Complete{
    
   
    // Function for finding maximum and value pair
    public static long calculate (int arr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        
        int ans = 0;
        
        int i = 0;
        
        while(i<n){
            int j = i+1;
            while(j<n && arr[i]==arr[j]) j++;
            int x = j-i;
            ans+= (x*(x-1))/2;
            i = j;
        }
        
        return ans;
    }
    
    
}
