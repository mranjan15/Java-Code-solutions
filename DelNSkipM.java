//https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1

class Solution
{ // 2 1
    static void linkdelete(Node head, int M, int N)
    {
        if(head== null) return;
        
        Node temp = head;
        
        while(temp.next != null) {
            int m = M;
            int n = N;
            while(m > 1) {
                m--;
                if(temp.next != null)
                    temp = temp.next;
            }
            
            Node curr = temp;
            
            while(n > 0) {
                n--;
                if(temp.next != null)
                    temp = temp.next;
            }
            
            curr.next = temp.next;
            
            if(temp.next != null)
                temp = temp.next;
            
        }
    }
}
