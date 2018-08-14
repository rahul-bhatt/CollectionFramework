package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		/*
		 * A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements.
		 * Two general purpose List implementations:
		 * 1. ArrayLst
		 * 2. LinkedList
		 */
		
		/*
		 * ArrayLst - Better performing Re-Sizable Array implementation.
		 */
		List<Integer> arrayList = new ArrayList<>();
		
		/*
		 * LinkedList - Doubly linked list implementation. Performs better under certain conditions.
		 */
		List<Integer> linkedList = new LinkedList<>();

	}

}
