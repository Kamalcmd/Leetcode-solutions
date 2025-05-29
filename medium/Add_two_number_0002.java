package medium;

//You are given two non-empty linked lists representing two non-negative integers.
//        The digits are stored in reverse order, and each of their nodes contains a single digit.
//        Add the two numbers and return the sum as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

public class Add_two_number_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
            if (carry > 0) {
                current.next = new ListNode(carry);
            }

            return dummyHead.next;
        }


    // ✅ Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Add_two_number_0002 obj = new Add_two_number_0002();

        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        ListNode result = obj.addTwoNumbers(l1, l2);
        printList(result);

        }
}
