package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 5 Nov 2024
 * Time   : 4:48:52 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 *  Set is a UnOrdered Group of Elements which stores Unique elements Only
 * List is a Ordered Group of Elements which stores duplicate elements also.
 */

public class HashSetDemo1 {

	public static void main(String[] args) {


		Set<String> programmingLanguages=new HashSet<>();

		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Java");
		programmingLanguages.add(null);
		programmingLanguages.add(null);

		System.out.println("=== Iterate over a HashSet using iterator() ===");
		Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
		while (programmingLanguageIterator.hasNext()) {
			String programmingLanguage = programmingLanguageIterator.next();
			System.out.println(programmingLanguage);
		}

		System.out.println("=== Iterate over a HashSet using Enchanced For loop ===");
		for(String programmingLanguage: programmingLanguages) {
			System.out.println(programmingLanguage);
		}

		HashSet<String> pl = new HashSet<>(programmingLanguages);

		System.out.println(pl);

		Object clonepl = new HashSet<>();// empty hash set

		// clone the Hashset
		clonepl=pl.clone();

		//display new set after cloning
		System.out.println(clonepl);

	}

}
