package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubscriberAppTest {
    @Test
    void testObserver() {
        Topic topic = new Topic();

        Subscriber jason = new TopicSubscriber("jason", topic);
        Subscriber james = new TopicSubscriber("james", topic);
        Subscriber snoopy = new TopicSubscriber("snoopy", topic);

        topic.subscribe(jason);
        topic.subscribe(james);
        topic.subscribe(snoopy);

        String newMessage = "IntelliK released a new post! Check it!";
        topic.postMessage(newMessage);

        assertEquals(newMessage, jason.getNotification());
        assertEquals(newMessage, james.getNotification());
        assertEquals(newMessage, snoopy.getNotification());
    }
}