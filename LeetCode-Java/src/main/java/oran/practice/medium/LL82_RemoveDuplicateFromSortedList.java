package datastructures.linkedlist.leetcode;

public class LL82_RemoveDuplicateFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if(head.next==null){
            return head;
        }

        ListNode dummy = new ListNode(-1,head);
        ListNode prev = dummy;
        ListNode current = head;

        while(current!=null){
            boolean isDuplicate = false;

            while(current.next!=null && current.val == current.next.val){
                isDuplicate=true;
                current = current.next;
            }
            if(isDuplicate){
                prev.next = current.next;
            }
            else{
                prev = prev.next;
            }
            current = current.next;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        LL82_RemoveDuplicateFromSortedList ll82RemoveDuplicateFromSortedList = new LL82_RemoveDuplicateFromSortedList();
        ListNode head = new ListNode(1, new ListNode(1,new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(3,
                        new ListNode(4,new ListNode(4,new ListNode(5)))))))));

       // ListNode head = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(2,new ListNode(3)))));
        ListNode listNode = ll82RemoveDuplicateFromSortedList.deleteDuplicates(head);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
