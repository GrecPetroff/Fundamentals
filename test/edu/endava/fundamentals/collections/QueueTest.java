package edu.endava.fundamentals.collections;

import java.util.*;

public class QueueTest {

	public static void main(String args[]) {
		Queue queueA = new LinkedList();
		Queue queueB = new PriorityQueue();

		// Adding elements
		queueA.add("element 1");
		queueA.add("element 3");
		queueA.add("element 2");
		

		System.out.println("Show using Iterator");
		// access using Iterator
		Iterator iterator = queueA.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.print(element + " ");
		}
		// Deleting first element 
		queueA.poll();
		System.out.println();
		System.out.println();

		// access using new for-loop
		System.out.println("Show using loop");
		for (Object object : queueA) {
			String element = (String) object;
			System.out.print(element + " ");
		}

		System.out.println("\n");
		//Checking if queue is empty
		System.out.println("Queue is empty :  " + queueA.isEmpty());
		//Clearing Queue 
		System.out.println("Clearing queue");
		queueA.clear();

		System.out.println("Queue is empty :  " + queueA.isEmpty());

	}
}
