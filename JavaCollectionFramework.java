/*
 * Java Collection Framework :- The are the some inbuilt classes and interfaces in Java (also known as Collection Frameworks) which we can use in our project or competitive tests. While learning DSA we make these classes and interfaces from scratch but in competitive programming it is not possible to write from scratch due to time bound and hence these collection frameworks comes in handy.
 * 
 * Collection of Classes and Interfaces :-
 * 1. Interfaces :- It contains Iterables and this Iterable again has a collection inside it which implements the Interfaces. There are four most important Interface Collections namely, List, Queue, Set and Map which are four types of data structures. But if you think then you will find out that you cannot use these data structures directly because these are interfaces then question arises, how to use it? We have learnt in OOPS concept that we can use it in form of classes. All these interfaces can be inherited by some classes and then we can use these classes.
 * 
 * There are some common methods for all the collections which is discusses below.
 * 
 * i. add() :- This can add any element to the collection.
 * 
 * ii. size() :- It gives the size of that data structure or collection.
 * 
 * iii. remove() :- It removes the element from the collection.
 * 
 * iv. iterate() :- It helps to loop on that collection.
 * 
 * v. addAll() :- It helps to add more than one element in our collection.
 * 
 * vi. removeAll() :- It helps to remove more than one element from the collection.
 * 
 * vii. clear() :- It clears all the elements from the collection.
 * 
 * 
 * Now talking about the 1st Interface i.e. 
 * 
 * List Interface are very easy to implement. Here we have three important classes namely, ArrayList, LinkedList and Stack(Vector class).
 * 
 * We have already studied about the ArrayList before which is a variable size of Array.
 * 
 * LinkedList :- If we combine different, different parts together then we will form a LinkedList.
 * 
 * Vector class :- It is similar to ArrayList but it is more thread safe. Thread safe is the part of Advance Java where we will be discussing about multi-threading (multiple parts of program executing at the same time) which we don't have to see now but here we will be discussing about the Stack. We have discussed about Stack even before which discussing about the memory that memory can be in the form of either Heap or Stack. To understand more about Stack you can refer to the Recursion topic. Also Stack uses the principle called LIFO (Last In First Out)
 * 
 * 
 * Queue Interface :- It uses the principle called FIFO (First In First Out). There are three major classes in queue also namely, PriorityQueue, LinkedList and Deque (ArrayDeque).
 * 
 * PriorityQueue :- It is implemented when we have to set some condition/s in queue.
 * 
 * LinkedList :- We have discussed earlier in the List Interface.
 * 
 * Deque :- It stands for Double Ended Queue i.e. elements can be added or removed from both the ends of the queue.
 * 
 * 
 * Set Interface :- In Java there is Set Interface and Map Interface which are very important interfaces of Java. These doesn't come under main data structures but is very widely asked in all the major company interviews like Google, Amazon, Flipkart, etc. and you can use these interfaces to solve your problems very easily with minimal time and space complexity. Also these are very easy to learn.
 * 
 * In Set Interface there are three major classes to learn namely, HashSet, LinkedHashSet, TreeSet (SortedSet).
 * 
 * What is set?
 * Set is a collection of unique elements.
 * 
 * HashSet :- Normal set in which elements are placed randomly.
 * 
 * LinkedHashSet :- In this the elements are placed in a sequence by chaining them together.
 * 
 * TreeSet (SortedSet) :- The elements are arranged in either ascending or descending order in a set.
 * 
 * 
 * Map Interface :- This interface maps two things that is the key with the value. There are four important classes in Map namely, HashMap, LinkedHashMap, TreeMap (SortedMap), Hashtable.
 * 
 * Hashtable :- We don't use this practically. It is rarely used.
 * 
 * These HashMap, LinkedHashMap and TreeMap are similar to Set as internally these uses Set.
 * 
 * HashMap :- Things are arranged in random order.
 * 
 * LinkedHashMap :- In this things are placed in a sequence by chaining them together.
 * 
 * TreeMap :- Things are arranged in accordance with 'key' in sorted fashion.
 * 
 * 
 * Now you might ask, we studies all these but what about Trees and Graphs?
 * Trees and Graphs are not directly given in Java. We implement Trees and Graphs using these interfaces.
 * 
 * Also in case if these collection are not able to solve our problem then we can make our own collection by using these collections to solve our problem given that our manually made collection should have all the methods which we discuss at the beginning into it.
 * 
 * 
 * Before moving into further topics, I recommend you all to take a look at ArrayList.
 */
public class JavaCollectionFramework {
    public static void main(String args[]) {

    }
}