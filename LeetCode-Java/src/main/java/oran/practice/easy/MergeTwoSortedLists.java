package oran.practice.easy;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 */

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode () {
    }

    ListNode (int val) {
        this.val = val;
    }

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode merged = new ListNode();
        if (list1.val < list2.val) {
            merged.val = list1.val;
            merged.next = mergeTwoLists(list1.next,list2);
        }
        else if (list1.val > list2.val) {
            merged.val = list2.val;
            merged.next = mergeTwoLists(list2.next,list1);
        }
        else {
            merged.val = list1.val;
            merged.next = mergeTwoLists(list1.next, list2);
        }

        return merged;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        System.out.println(mergeTwoSortedLists.mergeTwoLists(list1,list2));
    }
}
