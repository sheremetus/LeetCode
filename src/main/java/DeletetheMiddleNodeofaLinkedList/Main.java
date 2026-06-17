package DeletetheMiddleNodeofaLinkedList;

import java.util.LinkedList;

/**
 * 2095. Delete the Middle Node of a Linked List
 * Medium
 * Topics
 * premium lock icon
 * Companies
 * Hint
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 * <p>
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
 * <p>
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,3,4,7,1,2,6]
 * Output: [1,3,4,1,2,6]
 * Explanation:
 * The above figure represents the given linked list. The indices of the nodes are written below.
 * Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
 * We return the new list after removing this node.
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2,3,4]
 * Output: [1,2,4]
 * Explanation:
 * The above figure represents the given linked list.
 * For n = 4, node 2 with value 3 is the middle node, which is marked in red.
 * Example 3:
 * <p>
 * <p>
 * Input: head = [2,1]
 * Output: [2]
 * Explanation:
 * The above figure represents the given linked list.
 * For n = 2, node 1 with value 1 is the middle node, which is marked in red.
 * Node 0 with value 2 is the only node remaining after removing node 1.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 105].
 * 1 <= Node.val <= 105
 */
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(7,
                                        new ListNode(1,
                                                new ListNode(2,
                                                        new ListNode(6)

                                                ))))));


        Solution solution = new Solution();

        ListNode result = solution.deleteMiddle(head);
        System.out.println(result);

    }

}
