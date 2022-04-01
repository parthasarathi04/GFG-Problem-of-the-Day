class GfG{
    public Node moveZeroes(Node head){
        //Your Code here.
        Node zero = new Node(0);
        Node dummy = new Node(-1);
        
        Node z = zero, d = dummy;
        
        Node t = head;
        
        while(t!=null){
            if(t.data==0){
                z.next = t;
                z = z.next;
                t = t.next;
                z.next = null;
            }
            else{
                d.next = t;
                d = d.next;
                t = t.next;
                d.next = null;
            }
        }
        
        z.next = dummy.next;
        
        return zero.next;
    }
}
