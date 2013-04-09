package JMock;

import java.util.ArrayList;

public class Publisher {

	ArrayList<Subscriber> subs = new ArrayList<Subscriber>();
	void add(Subscriber s)
	{
		subs.add(s);
	}

	void publish(String message)
	{
		System.out.println("New post: " + message);
	}
	
}
