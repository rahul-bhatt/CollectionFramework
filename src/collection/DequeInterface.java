package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {

	public static void main(String[] args) {
		/*
		 * A deque is a double-ended-queue. A double-ended-queue is a linear collection of elements that supports the insertion 
		 * and removal of elements at both end points. The Deque interface is a richer abstract data type than both Stack and Queue 
		 * because it implements both stacks and queues at the same time.
		 * Most Deque implementations place no fixed limits on the number of elements they may contain, 
		 * but this interface supports capacity-restricted deques as well as those with no fixed size limit.
		 */
		
		/*
		 * Resizable-array implementation of the Deque interface. 
		 * Array deques have no capacity restrictions; they grow as necessary to support usage. 
		 * They are not thread-safe; in the absence of external synchronization, they do not support concurrent access by multiple threads. 
		 * Null elements are prohibited. 
		 * This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
		 */
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		Deque<Integer> linkedListAsDeque = new LinkedList<>();

	}

}
