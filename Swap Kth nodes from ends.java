/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        Node a,b,p,q;
        a=b=p=q=null;
        
        int i=1;
        
        Node dummy = new Node(-1);
        
        dummy.next = head;
        
        p=q=dummy;
        
        Node t=head;
        
        while(t!=null && (a==null || b==null)){
            
            if(i==K) a=t;
            
            if(i==num-K+1) b=t;
            
            if(a==null) p=t;
            if(b==null) q=t;
            
            t=t.next;
            
            i++;
        }
        
        if(a!=null&&b!=null){
            
            p.next=b;
            
            q.next=a;
            
            t=a.next;
            
            a.next=b.next;
            
            b.next=t;
        }
        
        return dummy.next;
    }
}
