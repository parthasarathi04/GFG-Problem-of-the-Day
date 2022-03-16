// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    private static ArrayList<ArrayList<Integer>> ans;
   
    private static ArrayList<Integer> arr;
    
    
    private static void find(ArrayList<Integer> A,int i){
        
        ans.add(new ArrayList<Integer>(arr));
        
        for(;i<A.size();i++){
            arr.add(A.get(i));
            find(A,i+1);
            arr.remove(arr.size()-1);
        }
        
    }
    
   
   
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        //code here
        ans = new ArrayList<>();
        
        arr = new ArrayList<>();
        
        find(A,0);
        
        Collections.sort(ans,(a,b)->{
            
            for(int i=0;i<a.size();i++){
                if(i==b.size()) return 1;
                if(b.get(i)<a.get(i)) return 1;
                if(b.get(i)>a.get(i)) return -1;
            }
            
            return a.size()-b.size();
        });
        
        return ans;
    }
}
