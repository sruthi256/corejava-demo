package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 10:16:37 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap <Integer,String>();
		hm.put(111, "John");
		hm.put(222, "Jim");
		hm.put(333, "Mike");
		hm.put(444, null);
		hm.put(null, "Jimmy");
		hm.put(null, "Jack");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
