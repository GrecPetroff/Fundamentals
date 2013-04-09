package Collections;

import java.util.*;

public class CollectionsTest {

	public static void main(String args[]) {
		Collection collection1 = new HashSet<String>();

		System.out.println("Adding and showing elements:");

		collection1.add("One");
		collection1.add("Two");
		collection1.add("Three");
		collection1.add("Two");
		collection1.add("Five");

		System.out.print("Collection1: ");
		Iterator iterator = collection1.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Adding and removing elements:");

		// Add and Remove element
		String anElement = "Six";
		collection1.add(anElement);
		collection1.remove("One");
		System.out.print("Collection1: ");
		iterator = collection1.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println();

		// addAll
		System.out
				.println("Adding all elements from one collection to another:");

		List<String> list1 = new ArrayList<String>();

		list1.addAll(collection1);
		System.out.print("List1: ");
		for (String stringElement : list1) {
			System.out.print(stringElement + " ");
		}

		System.out.println();
		System.out.println();

		// Contains
		System.out.println("Using contains and containsAll methods:");
		boolean listContain;
		listContain = list1.contains("Six");

		if (listContain == true) {
			System.out.println("List contains element \"Six\"");
		} else {
			System.out.println("Fail");
		}

		// Contains ALL
		listContain = list1.containsAll(collection1);
		if (listContain == true) {
			System.out
					.println("List contains All elements from first Collection1");
		} else {
			System.out.println("Fail");
		}

	}
}
