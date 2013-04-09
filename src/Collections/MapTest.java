package Collections;

import java.util.*;

public class MapTest {

	public static void main(String args[]) {
		// Initialize Map for Cars
		Map carMap = new HashMap<Integer, Car>();

		// Creating Car Objects
		Car car1 = new Car("bmw", 4);
		Car car2 = new Car("volvo", 4);
		Car car4 = new Car("opel", 6);
		Car car3 = car2;
		
		// Putting objects into the map
		carMap.put(1, car1);
		carMap.put(3, car2);
		carMap.put(12, car3);
		carMap.put(54, car4);

		// Initialize iterator on map key
		Iterator iterator = carMap.keySet().iterator();
		
		// Showing information about cars
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = carMap.get(key);
			System.out.print("key: " + (int) key + "  ");
			((Car) value).show();
		}
		// Checking if map contains object with key 54.
		System.out.println("Set contains obj: " + carMap.containsKey(54));

	}
}
