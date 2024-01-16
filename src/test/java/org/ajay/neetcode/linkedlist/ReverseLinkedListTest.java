package org.ajay.neetcode.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void testReverseListWithValidInput() {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		// Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode<Integer> head = createLinkedList(1, 2, 3, 4, 5);
		// Reversing the linked list: 5 -> 4 -> 3 -> 2 -> 1
		ListNode<Integer> reversedHead = reverseLinkedList.reverseList(head);
		// Verifying the reversed linked list
		assertLinkedListEquals(reversedHead, 5, 4, 3, 2, 1);
	}

	@Test
	public void testReverseListWithEmptyList() {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode<Integer> head = null;

		// Reversing an empty list should still result in an empty list
		ListNode<Integer> reversedHead = reverseLinkedList.reverseList(head);

		assertNull(reversedHead);
	}

	// Helper method to create a linked list from an array of values
	private ListNode<Integer> createLinkedList(Integer... values) {
		ListNode<Integer> dummy = new ListNode<Integer>(0);
		ListNode<Integer> current = dummy;
		for (Integer value : values) {
			current.setNext(new ListNode<Integer>(value));
			current = current.getNext();
		}
		return dummy.getNext();
	}

	// Helper method to verify if a linked list matches the expected values
	private void assertLinkedListEquals(ListNode<Integer> head, Integer... expectedValues) {
		for (Integer expectedValue : expectedValues) {
			assertNotNull(head);
			assertEquals(expectedValue.intValue(), head.getValue().intValue());
			head = head.getNext();
		}
		assertNull(head);
	}
}
