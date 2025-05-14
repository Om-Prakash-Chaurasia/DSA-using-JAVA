/*
 * HashSet :- It is a special type of data structure, slowly we will learn about HashMap,
 * HashTable and Hashing and how to implement them.
 * We use the concept of HashMap and HashSet when we want to drastically reduce the TC 
 * and making it most efficient. It is an unordered data structure.
 * 
 * Set :- It is a special structure in which only we cannot put duplicates inside it.
 * 
 * Why is HashSet so important?
 * It is one of the most important data structure because of its TC. It takes only 
 * TC = O(1) i.e. constant time for Insert/Add, Search/Contains, or Delete/Remove.
 * All the above operations are very important for any data structure.
 * 
 * Comparison of HashSet with other data structures.
 * 1. Array takes :- O(1) to Insert, O(n) to Search, and O(n) to Remove.
 * 
 * 2. Sorted Array takes :- O(n) to Insert, O(logn) to Search, and O(n) to Remove.
 * 
 * 3. BST takes :- O(h) to Insert, Search, or Remove and in worst case it is O(n)
 * for Insert and Remove and O(logn) to Search.
 * 
 * All these data structure are not efficient as HashSet.
 * 
 * Syntax :- It is similar to ArrayList i.e. ArrayList<Integer> list = new ArrayList<>();
 * Similarly, HashSet<Integer> set = new HashSet<>();
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String args[]) {
        // Creating HashSet.
        HashSet<Integer> set = new HashSet<>();

        // Inserting into set.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Searching in set.
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        // Size of set.
        System.out.println("Size of set is : " + set.size());

        if (!set.contains(6)) {
            System.out.println("Set does not contains 6");
        }

        // Deleting from set.
        set.remove(1);
        // Check for that element in set after deleting.
        if (!set.contains(1)) {
            System.out.println("Set does not contain 1 => We deleted 1");
        }

        // Printing all the elements of a set.
        System.out.println(set);

        /*
         * Iterator :- It is a variable in set which which can traverse on a set as we
         * don't have index for elements in set we have to use Iterator. And to use this
         * we need to first import Iterator.
         */
        Iterator<Integer> it = set.iterator(); // or, Iterator it = set.iterator();

        /*
         * It has two functions :- .hasNext() which returns boolean value and .next()
         * which returns the next value in the set and when we again do .next() it will
         * return the next value of the previous next and so on. Using these two methods
         * together we can Loop/Iterate over the set.
         */
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
         * There is no guarantee that the order in which you have inserted the element
         * in the set it will come in the same order as it does not have index. This is
         * even mentioned in the definition of HashSet in VS Code. i.e. HashSet is an
         * unordered data structure
         */
    }
}
/*---------------------------------------------------------------- */