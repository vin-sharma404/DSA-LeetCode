/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        for (int i = 0; i + k <= list.size(); i += k) {

            int left = i;
            int right = i + k - 1;

            while (left < right) {
                ListNode swap = list.get(left);
                list.set(left, list.get(right));
                list.set(right, swap);

                left++;
                right--;
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        list.get(list.size() - 1).next = null;

        
        return list.get(0);
    }
}