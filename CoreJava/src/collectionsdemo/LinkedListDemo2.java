package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 5 Nov 2024
* Time   : 4:14:02 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class LinkedListDemo2 {

	public static void main(String[] args) {
		 // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");

        System.out.println("Initial LinkedList : " + friends);

        // Adding an element at the specified position in the LinkedList
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        // Adding an element at the beginning of the LinkedList
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);

        System.out.println("After addAll(familyFriends) : " + friends);

        System.out.println("*********** Retrieve Elements from Linked List*************");
        System.out.println("First Friend in a List :"+friends.getFirst());
        System.out.println("Last Friend in  a List:"+friends.getLast());
        System.out.println("Search a friend in position 3 :"+friends.get(3));
        System.out.println("Delete a last friend :"+friends.remove("Walt"));
        System.out.println("Find position of John in a ll :"+friends.indexOf("John"));

        System.out.println("Linked List Contents:");

        for(String s:friends)
        {
            System.out.println(s);
        }

        friends.removeFirst();
        friends.removeLast();
        System.out.println("After removing First & last element : "+friends);

        friends.set(0,"New Friend"); //Update
        friends.remove(1);
        System.out.println(friends);
        System.out.println("The First Friend after Update : "+friends.get(0));

        System.out.println("******* Binary Search ******************");
        Collections.sort(friends);
        System.out.println(friends);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Friend to Search");
        String searchName=scanner.next();

        //Collections utility class binarySearch()
        int pos= Collections.binarySearch(friends,searchName);
        System.out.println(searchName+" is at Position : "+pos);
	}

}
