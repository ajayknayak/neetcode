package org.ajay.neetcode.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MergeTwoSortedListTest {

	@Test
	public void testMergeTwoListsWithValidInput() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		// Creating two sorted linked lists: 1 -> 3 -> 5 and 2 -> 4 -> 6
		ListNode<Integer> list1 = createLinkedList(1, 3, 5);
		ListNode<Integer> list2 = createLinkedList(2, 4, 6);

		// Merging the two lists: 1 -> 2 -> 3 -> 4 -> 5 -> 6
		ListNode<Integer> mergedList = merger.mergeTwoLists(list1, list2);

		// Verifying the merged linked list
		assertLinkedListEquals(mergedList, 1, 2, 3, 4, 5, 6);
	}
	
	@Test
	public void testMergeTwoListsWithValidInput_1() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		// Creating two sorted linked lists: 1 -> 2 -> 4 and 1 -> 3 -> 4
		ListNode<Integer> list1 = createLinkedList(1, 2, 4);
		ListNode<Integer> list2 = createLinkedList(1, 3, 4);

		// Merging the two lists: 1 -> 1 -> 2 -> 3 -> 4 -> 4
		ListNode<Integer> mergedList = merger.mergeTwoLists(list1, list2);

		// Verifying the merged linked list
		assertLinkedListEquals(mergedList, 1, 1, 2, 3, 4, 4);
	}

// Using recursion
	@Test
	public void testMergeTwoListsWithRecursionWithValidInput() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		// Creating two sorted linked lists: 1 -> 3 -> 5 and 2 -> 4 -> 6
		ListNode<Integer> list1 = createLinkedList(1, 3, 5);
		ListNode<Integer> list2 = createLinkedList(2, 4, 6);

		// Merging the two lists: 1 -> 2 -> 3 -> 4 -> 5 -> 6
		ListNode<Integer> mergedList = merger.mergeTwoListsWithRecursion(list1, list2);

		// Verifying the merged linked list
		assertLinkedListEquals(mergedList, 1, 2, 3, 4, 5, 6);
	}
	
	@Test
	public void testMergeTwoListsWithRecursionWithValidInput_1() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		// Creating two sorted linked lists: 1 -> 2 -> 4 and 1 -> 3 -> 4
		ListNode<Integer> list1 = createLinkedList(1, 2, 4);
		ListNode<Integer> list2 = createLinkedList(1, 3, 4);

		// Merging the two lists: 1 -> 1 -> 2 -> 3 -> 4 -> 4
		ListNode<Integer> mergedList = merger.mergeTwoListsWithRecursion(list1, list2);

		// Verifying the merged linked list
		assertLinkedListEquals(mergedList, 1, 1, 2, 3, 4, 4);
	}
	
	@Test
	public void testMergeTwoListsWithOneEmptyList() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		// Creating a sorted linked list: 1 -> 3 -> 5
		ListNode<Integer> list1 = createLinkedList(1, 3, 5);
		ListNode<Integer> list2 = null; // Empty list

		// Merging with an empty list should return the non-empty list
		ListNode<Integer> mergedList = merger.mergeTwoLists(list1, list2);

		// Verifying the merged linked list
		assertLinkedListEquals(mergedList, 1, 3, 5);
	}

	@Test
	public void testMergeTwoListsWithBothEmptyLists() {
		MergeTwoSortedList merger = new MergeTwoSortedList();

		ListNode<Integer> list1 = null; // Empty list
		ListNode<Integer> list2 = null; // Empty list

		// Merging two empty lists should result in an empty list
		ListNode<Integer> mergedList = merger.mergeTwoLists(list1, list2);

		assertNull(mergedList);
	}

	// Helper method to create a sorted linked list from an array of values
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
