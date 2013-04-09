package Collections;

import java.util.*;

public class SetTest {

	public static void main(String args[]) {
		//Initializing HashSet
		Set carSet = new HashSet<Car>();
		//Initializing SortedSet
		SortedSet sorted = new TreeSet<Car>();
		
		//Creating array of cars
		Car[] carsArray = new Car[6];
		//Initializing array of cars
		for(int i = 0; i < 3; i++ ) {
			carsArray[i] = new Car("bmw", 4);
		}
		
		carsArray[3] = new Car("opel", 6);
		carsArray[4] = carsArray[1];

		//Initializing Set
		for(int i = 0; i < 5; i++ ) {
			carSet.add(carsArray[i]);

		}

		//Showing set
		for (Object object : carSet) {
			((Car) object).show();

		}
		//Checking if carSet contains object
		System.out.println("Set contains obj: " + carSet.contains(new Car("opel",6)));
		
		System.out.println("Sorted set: " );
		//Copying all elements from set to sorted set
		sorted.addAll(carSet);
		//Showing sorted set
		for (Object object : sorted) {
			((Car) object).show();
		}
	}
}
