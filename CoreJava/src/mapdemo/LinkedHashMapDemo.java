package mapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 6 Nov 2024
 * Time   : 10:43:31 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//LinkedHAshMap it maintains the Entryset Order

		// Create a LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		// Add elements to the LinkedHashMap
		linkedHashMap.put("Apple", 3);
		linkedHashMap.put("Banana", 2);
		linkedHashMap.put("Cherry", 5);
		linkedHashMap.put("Date", 4);
		linkedHashMap.put("Elderberry", 10);

		// Display elements of the LinkedHashMap
		System.out.println("LinkedHashMap elements:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// Get an element by key
		String key = "Cherry";
		Integer value = linkedHashMap.get(key);
		System.out.println("\nThe value associated with key \"" + key + "\" is " + value);

		// Check if a key exists
		String checkKey = "Banana";
		boolean keyExists = linkedHashMap.containsKey(checkKey);
		System.out.println("\nDoes key \"" + checkKey + "\" exist? " + keyExists);

		// Check if a value exists
		int checkValue = 4;
		boolean valueExists = linkedHashMap.containsValue(checkValue);
		System.out.println("Does value \"" + checkValue + "\" exist? " + valueExists);

		// Remove an element by key
		String removeKey = "Date";
		Integer removedValue = linkedHashMap.remove(removeKey);
		System.out.println("\nRemoved key \"" + removeKey + "\" with value " + removedValue);

		// Display elements after removal
		System.out.println("\nLinkedHashMap elements after removal:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// Iterate over the keys
		System.out.println("\nIterating over the keys:");
		for (String k : linkedHashMap.keySet()) {
			System.out.println(k);
		}

		// Iterate over the values
		System.out.println("\nIterating over the values:");
		for (Integer v : linkedHashMap.values()) {
			System.out.println(v);
		}

		// Clear the LinkedHashMap
		linkedHashMap.clear();
		System.out.println("\nAll elements removed. Is the LinkedHashMap empty? " + linkedHashMap.isEmpty());

	}

}
