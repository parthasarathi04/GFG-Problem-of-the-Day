// { Driver Code Starts

//Initial Template for Java

import java.util.*;

import java.lang.*;

import java.io.*;

class GFG

{

    public static void main(String[] args) throws IOException

    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        while(T-->0)

        {

            String[] s = br.readLine().trim().split(" ");

            int n = Integer.parseInt(s[0]);

            int m = Integer.parseInt(s[1]);

            int k = Integer.parseInt(s[2]);

            int[][] blocked_cells = new int[k][2];

            for(int i = 0; i < k; i++){

                String[] s1 = br.readLine().trim().split(" ");

                for(int j = 0; j < 2; j++){

                    blocked_cells[i][j] = Integer.parseInt(s1[j]);

                }

            }

            Solution obj = new Solution();

            int ans = obj.FindWays(n, m, blocked_cells);

            System.out.println(ans);

        }

    }

}

// } Driver Code Ends

//User function Template for Java

class Solution

{

    public int FindWays(int n, int m, int[][] blocked_cells)

    {

        // Code here

        final int mod = (int)(1e9+7);

        int[][] dp = new int[n][m];

        for(int i=0; i<blocked_cells.length; i++){

            dp[ blocked_cells[i][0] - 1 ][ blocked_cells[i][1] - 1 ] = -1;

        }

        if(dp[0][0]==-1 || dp[n-1][m-1]==-1) return 0;

        dp[n-1][m-1] = 1;

        for(int i=n-1; i>=0; i--){

            for(int j=m-1; j>=0; j--){

                if(dp[i][j]==-1){

                    dp[i][j] = 0;

                    continue;

                }

                if(i<n-1) dp[i][j]+=dp[i+1][j]%mod;

                if(j<m-1) dp[i][j]+=dp[i][j+1]%mod;

                dp[i][j]%=mod;

            }

        }

        return dp[0][0];

    }

}
