package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/*
		 * A Set is a Collection that cannot contain duplicate elements.
		 * Three general purpose set implementations:
		 * 1. HashSet
		 * 2. TreeSet
		 * 3. LinkedHashSet
		 */
		
		/*
		 *  HashSet - stores its elements in a hash table, is the best-performing implementation; 
		 *  however it makes no guarantees concerning the order of iteration. 
		 */
		Set<Integer> hashSet = new HashSet<>();
		
		/*
		 *  TreeSet - stores its elements in a red-black tree, orders its elements based on their values; 
		 *  it is substantially slower than HashSet.
		 */
		Set<Integer> treeSet = new TreeSet<>();
		
		/*
		 * LinkedHashSet - is implemented as a hash table with a linked list running through it, 
		 * orders its elements based on the order in which they were inserted into the set (insertion-order). 
		 * LinkedHashSet spares its clients from the unspecified, generally chaotic ordering provided by HashSet 
		 * at a cost that is only slightly higher.
		 */
		Set<Integer> linkedHashSet = new LinkedHashSet<>();

	}

}
