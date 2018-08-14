package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		/*
		 * A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value.
		 */
		
		/*
		 * Hash table based implementation of the Map interface. 
		 * This implementation provides all of the optional map operations, and permits null values and the null key. 
		 * (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) 
		 * This class makes no guarantees as to the order of the map; 
		 * in particular, it does not guarantee that the order will remain constant over time.
		 */
		Map<Integer, String> hashMap = new HashMap<>();
		
		/*
		 * A Red-Black tree based NavigableMap implementation. 
		 * The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, 
		 * depending on which constructor is used. 
		 */
		Map<Integer, String> treeMap = new TreeMap<>();
		
		/*
		 * Hash table and linked list implementation of the Map interface, with predictable iteration order.
		 * This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries. 
		 * This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order). 
		 */
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

	}

}
