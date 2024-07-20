class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) 
    {
        val = x;
        next = null;
    }
}

public class RemoveDuplicates 
{
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode current = head;
        
        while (current != null && current.next != null) 
        {
            if (current.val == current.next.val)
            {
                // Skip the duplicate node
                current.next = current.next.next;
            }
            else 
            {
                // Move to the next node
                current = current.next;
            }
        }
        
        return head;
    }

    // Helper method to print the linked list
    public void printList(ListNode head)
    {
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        RemoveDuplicates solution = new RemoveDuplicates();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);
        head1.next.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List 1: ");
        solution.printList(head1);
        ListNode result1 = solution.deleteDuplicates(head1);
        System.out.print("Modified List 1: ");
        solution.printList(result1);

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);

        System.out.print("Original List 2: ");
        solution.printList(head2);
        ListNode result2 = solution.deleteDuplicates(head2);
        System.out.print("Modified List 2: ");
        solution.printList(result2);
    }
}
