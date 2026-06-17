class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode previousNode = null;
        ListNode currentNode = slowPointer;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = previousNode;

        while (secondHalf != null) {

            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
