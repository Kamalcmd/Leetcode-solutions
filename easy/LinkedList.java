package easy;
// LinkedList insertion | Deletion | Update


public class LinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val)
        {
            this.val=val;
            this.next = null;
        }
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            if (head.next != null){
                System.out.println(" -> ");
                head = head.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        ListNode head = new ListNode(10);
        head.next= new ListNode(20);
        head.next.next = new ListNode(30);
        System.out.println("Initial List:" + head.val + " -> " + head.next.val + " -> " + head.next.next.val);
        System.out.println("Print last element :" + head.next.next.next);

        //Add elements in the last node
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new ListNode(40);
        System.out.println("After inserting 40: " + head.val + " -> " + head.next.val + " -> "
                + head.next.next.val + " -> " + head.next.next.next.val);


        // delete elements in the middle of node

        current = head;
        ListNode prev = null;
        while(current != null){
            if(current.val == 20){
                if(prev == null){
                    head = current.next;
                }else{
                    prev.next = current.next;
                }
                break;
            }
            prev = current;
            current = current.next;
        }


    }







}
