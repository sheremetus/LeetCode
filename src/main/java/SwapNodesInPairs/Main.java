package SwapNodesInPairs;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode();


        Solution solution = new Solution();
        System.out.println(solution.swapPairs(head2).toString());

    }
}
