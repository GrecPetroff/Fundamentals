package JMock;

import junit.framework.TestCase;

import org.jmock.Mockery;
import org.jmock.Expectations;

public class PublisherTest extends TestCase {
    Mockery context = new Mockery();

    public void testOneSubscriberReceivesAMessage() {
        // set up
        final Subscriber subscriber = context.mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);
        
        final String message = "My message";
        
        // expectations
        context.checking(new Expectations() {{
            oneOf  (subscriber).receive(message);
        }});

        // execute
        publisher.publish(message);
        subscriber.receive(message);
        
        // verify
        context.assertIsSatisfied();
    }
}