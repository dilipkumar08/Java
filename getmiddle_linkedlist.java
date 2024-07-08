
class Solution
{
    int getMiddle(Node head)
    {
         Node test=head;
         Node res =head;
         int length=1;
         
         while (test.next!=null && test!=null)
         {
             test=test.next;
             length+=1;
         }
         
         for(int i=0;i<(int)(length/2);i++)
         {
             res=res.next;
         }
    return res.data;
        }
}
  
