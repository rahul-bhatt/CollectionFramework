package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		/*
		 * A Queue is a collection for holding elements prior to processing.
		 */
		Queue<Integer> linkedListAsQueue = new LinkedList<>();
		
		/*
		 * PriorityQueue - An unbounded priority queue based on a priority heap. 
		 * The elements of the priority queue are ordered according to their natural ordering, 
		 * or by a Comparator provided at queue construction time, depending on which constructor is used. 
		 * A priority queue does not permit null elements. 
		 * A priority queue relying on natural ordering also does not permit insertion of non-comparable objects 
		 * (doing so may result in ClassCastException).
		 */
		Queue<Integer> priorityQueue = new PriorityQueue<>();

	}

}
