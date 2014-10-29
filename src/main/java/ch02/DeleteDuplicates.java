package ch02;

import java.util.ArrayList;
import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Question 2.1
 * 
 * Remove duplicates from an unsorted linked list.
 */

public class DeleteDuplicates {
	ListNode delete(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0), prev = dummy;
		while (head != null) {
			ListNode p = dummy.next;
			while (p != null) {
				if (head.val == p.val) break;
				p = p.next;
			}
			if (p == null) { prev.next = head; prev = prev.next; }
			head = head.next;
			prev.next = null;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ArrayList<ListNode> array = new ArrayList<ListNode>();
		array.add(new ListNode(5));
		array.add(new ListNode(3));
		array.add(new ListNode(2));
		array.add(new ListNode(10));
		array.add(new ListNode(2));
		array.add(new ListNode(4));
		array.add(new ListNode(3));
		array.add(new ListNode(2));
		for (int i = 0; i < array.size() - 1; i++)
			array.get(i).next = array.get(i + 1);
		
		ListNode.printList(array.get(0));
		DeleteDuplicates sol = new DeleteDuplicates();
		ListNode.printList(sol.delete(array.get(0)));
	}
}
