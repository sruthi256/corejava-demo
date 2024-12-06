package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 10:24:04 am
* Email  : Kopparapu.Sruthi@coforge.com
*/
/*
Map is used to create Data Structure with key-value pairs
 */
//Map of Employee id & Names
public class HashMapDemo2 {

	public static void main(String[] args) {
		
        HashMap<Integer,String> hmap=new HashMap<>();

        //add elements to hashmap
        hmap.put(12,"Ravi");
        hmap.put(2,"Rahul");
        hmap.put(7,"Singh");
        hmap.put(49,"Annie");
        hmap.put(3,"Ravi");
        hmap.put(6,"Amit");

        System.out.println("The Hashmap Entries: "+hmap);
        System.out.println("The keys in HashMap : "+hmap.keySet()); //return keys of a map
        System.out.println("The Entries in HashMap : "+hmap.entrySet()); //return entries of a map

        System.out.println("The Employee with id 6 is : "+hmap.get(6));

        System.out.println("*********** Employee Map *********");
        for (Map.Entry<Integer,String> m:hmap.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue() + " - "+hmap.get(m.getKey()));
        }

        // get values based on key
        String name=hmap.get(7);
        System.out.println("The Name with key 7 is :"+name);

        // remove values based on key
        hmap.remove(2);
        System.out.println(hmap);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Empoyee Id to be Searched: ");
        Integer eid=scan.nextInt();

        System.out.println("The Employee Id with "+eid+" is : "+hmap.get(eid));

	}

}
