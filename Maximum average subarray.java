class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        if(k>=n) return 0;
        
        int index = 0;
        
        int maxSum = 0;
        
        int sum= 0;
        
        for(int i=0;i<k;i++) sum+=arr[i];
        
        maxSum = sum;
        
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            
            if(sum>maxSum){
                maxSum = sum;
                index = i-k+1;
            }
        }
        
        return index;
    }
}
