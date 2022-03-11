// { Driver Code Starts

//Initial Template for Java

import java.io.*;

import java.util.*;

class GFG{

    public static void main(String args[])throws IOException

    {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        while(t-- > 0){

            int N = Integer.parseInt(in.readLine());

            String a[] = in.readLine().trim().split("\\s+");

            int arr[] = new int[N];

            for(int i = 0;i < N;i++)

                arr[i] = Integer.parseInt(a[i]);

            

            Solution ob = new Solution();

            System.out.println(ob.findHeight(N, arr));

        }

    }

}// } Driver Code Ends

//User function Template for Java

class Solution{

    static class P{

        int x,p,v=0;

        P(int a,int b){

            x = a;

            p = b;

        }

    }

    static int findHeight(int N, int arr[]){

        // code here

        P[] a = new P[N];

        for(int i=0;i<N;i++){

            a[i] = new P(i,arr[i]);

        }

        

        Arrays.sort(a,(x,y)->{return x.p-y.p;});

   

        a[0].v = 1;

        int m = 1;

        

        for(int i=1;i<N;i++){

            a[i].v = 1+a[a[i].p].v;

            m = Math.max(m,a[i].v);

        }

        

        return m;

   

    }

}
