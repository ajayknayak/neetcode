package org.ajay.neetcode.linkedlist;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: list1 = [1,2,4], list2 = [1,3,4] 
 * Output: [1,1,2,3,4,4] 
 * 
 * Example 2:
 * Input: list1 = [], list2 = [] 
 * Output: [] 
 * 
 * Example 3:
 * 
 * Input: list1 = [], list2 = [0] 
 * 
 * Output: [0]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in both lists is in the range [0, 50]. -100 <= Node.val
 * <= 100 Both list1 and list2 are sorted in non-decreasing order.
 * 
 * @author ajnayak
 *
 */

public class MergeTwoSortedList {

	/**
	 * Merge 2 List with iteration
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode<Integer> mergeTwoLists(ListNode<Integer> list1, ListNode<Integer> list2) {

		ListNode<Integer> sortedList = null;
		if (null == list1 && null == list2) {
			return sortedList;
		} else if (null == list1 && null != list2) {
			return list2;
		} else if (null != list1 && null == list2) {
			return list1;
		} else {
			sortedList = new ListNode<Integer>(0);
			ListNode<Integer> tmpSortedList = sortedList;
			while (null != list1 && null != list2) {

				if (list1.getData() <= list2.getData()) {
					tmpSortedList.setNext(list1);
					tmpSortedList = tmpSortedList.getNext();
					list1 = list1.getNext();
				} else {
					tmpSortedList.setNext(list2);
					tmpSortedList = tmpSortedList.getNext();
					list2 = list2.getNext();
				}
			}

			if (null == list1 && null != list2) {
				tmpSortedList.setNext(list2);
			}
			if (null != list1 && null == list2) {
				tmpSortedList.setNext(list2);
			}

		}
		return sortedList.getNext();
	}

	/**
	 * Merge 2 List with Recursion
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode<Integer> mergeTwoListsWithRecursion(ListNode<Integer> list1, ListNode<Integer> list2) {

		ListNode<Integer> sortedList = null;
		if(null == list1 && null == list2) {
			return sortedList;
		} else if(null == list1 && null != list2){
			return list2;
		} else if(null != list1 && null == list2){
			return list1;
		} else {
			if (list1.getData() <= list2.getData()) {
				sortedList = list1;
				sortedList.setNext(mergeTwoListsWithRecursion(list1.getNext(), list2));
			} else {
				sortedList = list2;
				sortedList.setNext(mergeTwoListsWithRecursion(list1, list2.getNext()));
			}
		}
		return sortedList;
	}
}
