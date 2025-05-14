/*
 * HashMap :- It is a collection framework which stores the data in key:value 
 * form where keys are unique and the value can be same also. It is an 
 * unordered data structure.
 * 
 * Wherever in JAVA you see key:value pair you can directly use HashMap.
 * 
 * If we have existing key then it will only update the value and 
 * if the is not present then it will create a new key:value pair.
 * 
 * Syntax :- HashMap<dataTypeOfKey, dataTypeOfValue> nameOfMap = new HashMap<>();
 * e.g. HashMap<String, Integer> map = new HashMap<>();
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting data in map.
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // Printing the map.
        System.out.println(map);

        map.put("China", 180); // In this case our value is getting updated
        // because the key already exists. If key would not exist then new key:value
        // pair would be inserted.
        System.out.println(map);

        // Search/Lookup operations in map.
        // Searching for key in the map.
        if (map.containsKey("Japan")) {
            System.out.println("Key is present in the map.");
        } else {
            System.out.println("Key is not present in the map.");
        }

        // Searching for value in the map. The value will be printed if key exists and
        // if not then the value will be Null.
        System.out.println(map.get("China")); // Key exists.
        System.out.println(map.get("Japan")); // Key does not exist.

        // Iteration on HashMap.
        for (Map.Entry<String, Integer> e : map.entrySet()) { // Similar to, for(int val : arr);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Another way to get only keys from the map. We can do this by using keySet().
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing the data from map.
        map.remove("China");
        System.out.println(map);
    }
}
/*---------------------------------------------------------------- */