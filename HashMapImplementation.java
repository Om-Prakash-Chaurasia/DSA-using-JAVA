/*
 * HashMap Internal Implementation in Java :- This is one of the most important topic
 * in Interviews as its TC = O(1) in most cases so, they want to know how is this 
 * happening internally so, the Interviewer directly asks this question along with code.
 * 
 * To understand this we show first know the internal functions of the HashMap which 
 * happens in TC = O(1) i.e.
 * 1. put()
 * 2. get()
 * 3. containsKey()
 * 4. remove()
 * 5. size()
 * 6. keySet()
 * 
 * NOTE :- We implement HashMap in Java with the help of Array of LinkedList i.e. every 
 * elements of an Array is going to be a LinkedList.
 * 
 * Now, first we are going to implement our put() method. But, before that we will need 
 * some variables like n -> nodes, which is equal to the number of data in all the 
 * LinkedList. N -> size of Array. Generally, each index of this array is know as 'Bucket'.
 * Index => Buckets = N = size of Array. 
 * 
 * Now, for put method we need to check whether the key which we want to put exists or 
 * does not exist in the map. If it already exists then we will only update the value of
 * that key. If not, then we will create a new key:value pair and add it to map.
 * 
 * Now, the real problem is that if key does not exist then how do we get to know in which 
 * bucket to store this new key:value.
 * Here comes the real concept of Hashing in Java. In Java, for Hashing we have so many
 * methods so, we don't have to go in detail for writing those methods from scratch.
 * 
 * Hashing :- It means changing the data from one form to another. e.g. if I have a data
 * 'abc' and if I change its form to '3586' then this is known as Hashing.
 * 
 * Now, there are so many algorithms for Hashing like Sha1, Sha256, etc. Hashing are mainly
 * used to store the passwords.
 * 
 * Note :- In HashMap, most of the time we calculate the average TC only which is constant so
 * we say it as O(1). And if we see the worst TC then it is O(n).
 * 
 * SUMMARY :- 
 * 1. We created an Array of LinkedList.
 * 2. The individual index of this Array is known as bucket.
 * 3. N = total no. of buckets and n = total no. of nodes.
 * 4. We will also use a 'HashFunction' which will act like a blackbox whose work is to take
 * a Key and return the bucket index. If the HashMap is same then the bucket will also remain
 * same for that element else bucket index will change.
 * 5. We will work in such a way that our value of ƛ <= K where K is a constant, so that the
 * TC of put() will remain constant which is O(ƛ) ~= K (constant).
 */

import java.util.*;

public class HashMapImplementation {
    static class HashMap<K, V> { // Here, K and V are also known as generics. Generics are variables which has
                                 // to hold the value of data type but we don't know what data type it will hold.
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total no. of Nodes.
        private int N; // Total no. of buckets.
        private LinkedList<Node> buckets[]; // N = buckets.length, now, this actually is our HashMap where we are going
                                            // to store all our data.

        @SuppressWarnings("unchecked") // This will help us to suppress the warning as in some versions of Java it is
        // mandatory to define the data type of LinkedList in case of we don't define
        // data type then it won't throw
        // error but it will give huge warning.
        public HashMap() { // This is a constructor for HashMap
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // This will create LinkedList for every index of the Array,
                                                      // before this null was stored.
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); // hashCode() gives us an integer value which can be +ve or -ve out of which we
                                     // need only +ve values which is our bucket index.
            return Math.abs(bi) % N; // Making -ve bucket index as +ve also we have the constrain that it can only
                                     // fall in the range of 0 to N - 1.
        }

        private int searchInLinkedList(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // which is the value of data index.
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2]; // New bucket of doubled size.

            // Creating LinkedList at every index of the new Array.
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Storing the data from old bucket to new one.
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // put() :- Puts data in our HashMap. It has the average TC = O(ƛ)
        public void put(K key, V value) {
            int bi = hashFunction(key); // This is a hashFunction which will return me the bucket index.
            int di = searchInLinkedList(key, bi); // This will search for data index if the data is already present in
                                                  // the LinkedList.
            if (di == -1) { // Key does not exists.
                buckets[bi].add(new Node(key, value)); // Adding data.
                n++; // Increasing the size of data index as new key is added.
            } else { // Key exists, then data index size does not increase.
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // Checking for the value of lambda.
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // Function to re-hash
                rehash();
            }
        }

        // get() :- It gives us the data index if the key is present or null if key is
        // not present.
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di == -1) { // Key does not exist.
                return null;
            } else { // Key exists.
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        // contains() :- It returns us a boolean value whether the key is present or
        // not.
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if (di == -1) { // Key does not exist.
                return false;
            } else { // Key exists.
                return true;
            }
        }

        // remove() :- It has two cases, if key exists then remove it from the
        // LinkedList and return its value, and if key does not exists then return null.
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di == -1) { // Key does not exist.
                return null;
            } else { // Key exists.
                Node node = buckets[bi].remove(di);
                n--; // After removing the data size will decrease.
                return node.value;
            }
        }

        // isEmpty() :- If no nodes are present in HasMap.
        public boolean isEmpty() {
            return n == 0;
        }

        // keySet() :- It will return all the keys in the HashMap in an Array.
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) { // This is our bucket index.
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // This is our data index.
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
