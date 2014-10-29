package ch02;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Question 2.3
 * 
 * Delete a node in the middle of a singly linked list, given only access to that node.
 */

public class DeleteNode {
	void delete(ListNode n) {
		if (n == null || n.next == null) return;
		ListNode next = n.next;
		n.val = next.val;
		n.next = next.next;
	}
}
